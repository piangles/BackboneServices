package org.piangles.backbone.services.prefs;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

public final class UserPreference implements Serializable
{
	private static final long serialVersionUID = 1L;

	private String userId;
	private Map<String, Object> nvPair = null;

	public UserPreference()
	{
	}

	public UserPreference(String userId)
	{
		this(userId, new HashMap<String, Object>());
	}

	public UserPreference(String userId, Map<String, Object> nvPair)
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
