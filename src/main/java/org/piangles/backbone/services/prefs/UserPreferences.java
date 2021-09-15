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
 
 
 
package org.piangles.backbone.services.prefs;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

public final class UserPreferences implements Serializable
{
	private static final long serialVersionUID = 1L;

	private String userId;
	private Map<String, Object> nvPair = null;

	public UserPreferences()
	{
	}

	public UserPreferences(String userId)
	{
		this(userId, new HashMap<String, Object>());
	}

	public UserPreferences(String userId, Map<String, Object> nvPair)
	{
		this.userId = userId;
		this.nvPair = nvPair;
	}

	public String getUserId()
	{
		return userId;
	}
	
	public String getValue(String name)
	{
		return (String)nvPair.get(name);
	}

	public void setValue(String name, String value)
	{
		nvPair.put(name, value);
	}

	public Map<String,Object> getNVPair()
	{
		return nvPair;
	}

	public boolean isEmpty()
	{
		return nvPair.isEmpty();
	}

	@Override
	public String toString()
	{
		return "UserPreference [userId=" + userId + ", nvPair=" + nvPair + "]";
	}
}
