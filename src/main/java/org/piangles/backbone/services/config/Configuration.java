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
 
 
 
package org.piangles.backbone.services.config;

import java.io.Serializable;
import java.util.Properties;

public final class Configuration implements Serializable
{
	private static final long serialVersionUID = 1L;
	
	private Properties nvPair = null;
	
	public Configuration()
	{
		this.nvPair = new Properties();
	}
	
	public String getValue(String name)
	{
		return nvPair.getProperty(name);
	}
	
	public void addNameValue(String name, String value)
	{
		nvPair.put(name, value);
	}
	
	public Properties getProperties()
	{
		return nvPair;
	}
	
	@Override
	public String toString()
	{
		String nvPairAsStr = null;
		if (nvPair != null)
		{
			nvPairAsStr = nvPair.toString();
		}
		return nvPairAsStr;
	}
}
