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
 
 
 
package org.piangles.backbone.services.id;

import java.io.Serializable;
import java.util.Date;

public final class Identifier implements Serializable
{
	private static final long serialVersionUID = 1L;
	
	private String type = null;
	private String value = null;
	private long generatedTimeStamp;
	private Date validTillDate = null; //null implies perpetual

	public Identifier(String type, String value, long generatedTimeStamp)
	{
		this(type, value, generatedTimeStamp, null);
	}

	public Identifier(String type, String value, long generatedTimeStamp, Date validTillDate)
	{
		this.type = type;
		this.value = value;
		this.generatedTimeStamp = generatedTimeStamp;
		this.validTillDate = validTillDate;
	}
	
	public String getType()
	{
		return type;
	}

	public String getValue()
	{
		return value;
	}

	public long getGeneratedTimeStamp()
	{
		return generatedTimeStamp;
	}

	public Date getValidTillDate()
	{
		return validTillDate;
	}
	
	public boolean isPerpetual()
	{
		return false;
	}

	@Override
	public String toString()
	{
		return "Identifier [type=" + type + ", value=" + value + ", generatedTimeStamp=" + generatedTimeStamp + ", validTillDate=" + validTillDate + "]";
	}
}
