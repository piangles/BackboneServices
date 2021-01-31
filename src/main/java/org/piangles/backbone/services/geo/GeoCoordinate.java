/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements. See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
 
 
package org.piangles.backbone.services.geo;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.ParseException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class GeoCoordinate implements Serializable
{
	private static final long serialVersionUID = 1L;

	public  static final String DMS_FORMAT = "(\\d+).*?(\\d+).*?(\\d+).*?([N|S|E|W]).*?";
	private static final Pattern DMS_PATTERN = Pattern.compile(DMS_FORMAT);
	/**
	 * Taken from
	 * https://gis.stackexchange.com/questions/8650/measuring-accuracy-of-latitude-and-longitude
	 * 
	 * Decimal Places   Aprox. Distance    Say What
	 * ------------------------------------------------------
	 * 0                111.1 km      		68.972 	miles
	 * 1                11.1  km      		6.832 	miles
	 * 2                1.11  km        	0.68 	miles
	 * 3                111   meters        364 	feet
	 * 4                11.1  meters        36 		feet
	 * 5                1.11  meter         3.64 	feet
	 * 6                0.111 meter     	4.37 	inches
	 * 7                1.11  centimeter    About 1/2 an inch
	 * 8                1.11  millimeter    The width of paperclip wire.
	 * 9                0.1   millimeter    The width of a strand of hair.
	 * 10               10    microns       A speck of pollen.
	 * 11               1.0   micron        A piece of cigarette smoke.
	 * 12               0.1   micron        You're doing virus-level mapping at this point.
	 * 13               10    nanometers    Does it matter how big this is?
	 * 14               1.0   nanometer     Your fingernail grows about this far in one second.
	 * 15               0.1   nanometer     An atom. An atom! What are you mapping?
	 */
	public static final int DEFAULT_SCALE = 5; ///Best choice is one of 4,5 or 6 

	private static final int MINUTES = 60;
	private static final BigDecimal MINUTES_BIGDECIMAL = BigDecimal.valueOf(MINUTES);
	private static final int SECONDS = 3600;

	private static final String DEGREES_SYMBOL = "°";
	private static final String MINUTES_SYMBOL = "'";
	private static final String SECONDS_SYMBOL = "\"";
	
	//Degrees, Minutes & Seconds (DMS) representation
	private int degrees;
	private int minutes;
	private int seconds;
	private Direction direction;
	private String dmsRepresentation = null;
	
	//Decimal Degrees (DD) representation
	private double decimalValue = 0.0;
	private boolean latitude;
	private boolean longitude; //Just for completeness
	private String ddRepresentation = null;
	
	public GeoCoordinate(double decimalValue, boolean latitude)
	{
		this.decimalValue = decimalValue;
		this.latitude = latitude;
		this.longitude = !latitude;
		
		//Convert to DMS Format
		BigDecimal bdDecimalValue = BigDecimal.valueOf(Math.abs(decimalValue));
		
	    this.degrees = bdDecimalValue.intValue();

	    BigDecimal bdFractionPart = bdDecimalValue.subtract(BigDecimal.valueOf(degrees));
	    BigDecimal minutesNotTruncated = bdFractionPart.multiply(MINUTES_BIGDECIMAL);
	    
	    this.minutes = minutesNotTruncated.intValue();
	    this.seconds = (int)Math.round(minutesNotTruncated.subtract(BigDecimal.valueOf(minutes)).multiply(MINUTES_BIGDECIMAL).doubleValue());
	    
		if (latitude)
		{
			this.direction = (decimalValue >= 0)? Direction.North : Direction.South;
		}
		else
		{
			this.direction = (decimalValue >= 0)? Direction.East : Direction.West;
		}
		
		initRepresentations();
	}

	public GeoCoordinate(int degrees, int minutes, int seconds, Direction direction)
	{
		this.degrees = degrees;
		this.minutes = minutes;
		this.seconds = seconds;
		this.direction = direction;
		
		if (direction == Direction.North || direction == Direction.South)
		{
			latitude = true;
		}
		else
		{
			latitude = false;
		}
		longitude = !latitude;

		//Convert to DD Format
		int southOrWest = (direction == Direction.South || direction == Direction.West)? -1 : 1;
		this.decimalValue = southOrWest * ((double)degrees + ((double)minutes / MINUTES) + ((double)seconds / SECONDS));
		this.decimalValue = getDecimalValue(DEFAULT_SCALE);
		
		initRepresentations();
	}

	public int getDegrees()
	{
		return degrees;
	}

	public int getMinutes()
	{
		return minutes;
	}

	public int getSeconds()
	{
		return seconds;
	}

	public Direction getDirection()
	{
		return direction;
	}

	public double getDecimalValue()
	{
		return decimalValue;
	}

	public double getDecimalValue(int scale)
	{
		return BigDecimal.valueOf(decimalValue).setScale(scale, RoundingMode.HALF_UP).doubleValue();
	}

	public boolean isLatitude()
	{
		return latitude;
	}

	public boolean isLongitude()
	{
		return longitude;
	}

	public String getDDRepresentation()
	{
		return ddRepresentation;
	}

	public String getDMSRepresentation()
	{
		return dmsRepresentation;
	}
	
	public static GeoCoordinate parse(String dmsRepresentation) throws ParseException
	{
		GeoCoordinate geoCoordinate = null;
		Matcher dmsMatcher = DMS_PATTERN.matcher(dmsRepresentation);

		if (dmsMatcher.find())
		{
			int degrees = Integer.parseInt(dmsMatcher.group(1));
			int minutes = Integer.parseInt(dmsMatcher.group(2));
			int seconds = Integer.parseInt(dmsMatcher.group(3));
			String dirCode = dmsMatcher.group(4);
			Direction direction = Direction.parse(dirCode);

			geoCoordinate = new GeoCoordinate(degrees, minutes, seconds, direction);
		}
		else
		{
			throw new ParseException("Does not match expected RegEx format : " + DMS_FORMAT, 0);
		}
		
		return geoCoordinate;
	}
	
	@Override
	public boolean equals(Object obj)
	{
		GeoCoordinate that = (GeoCoordinate)obj;
		return this.decimalValue == that.decimalValue;
	}

	public boolean equalsApproximate(GeoCoordinate that)
	{
		return this.dmsRepresentation.equals(that.dmsRepresentation);
	}

	@Override
	public String toString()
	{
		return ddRepresentation;
	}
	
	private void initRepresentations()
	{
		ddRepresentation = String.format("%s%s", decimalValue, DEGREES_SYMBOL);
		dmsRepresentation = String.format("%d%s %d%s %d%s %s", degrees, DEGREES_SYMBOL, minutes, MINUTES_SYMBOL, seconds, SECONDS_SYMBOL, direction);
	}
}
