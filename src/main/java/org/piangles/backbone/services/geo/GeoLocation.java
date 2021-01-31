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
import java.text.ParseException;

public final class GeoLocation implements Serializable 
{
	private static final long serialVersionUID = 1L;
	private GeoCoordinate latitude  = null;
	private GeoCoordinate longitude  = null;

	public GeoLocation(double latitude, double longitude)
	{
		this(new GeoCoordinate(latitude, true), new GeoCoordinate(longitude, false));
	}

	public GeoLocation(String latitude, String longitude) throws ParseException
	{
		this(GeoCoordinate.parse(latitude), GeoCoordinate.parse(longitude));
	}

	public GeoLocation(GeoCoordinate latitude, GeoCoordinate longitude)
	{
		this.latitude = latitude;
		this.longitude = longitude;
	}

	public GeoCoordinate getLatitude()
	{
		return latitude;
	}

	public GeoCoordinate getLongitude()
	{
		return longitude;
	}
	
	@Override
	public String toString()
	{
		return "Location [latitude=" + latitude + ", longitude=" + longitude + "]";
	}
}
