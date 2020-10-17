package org.piangles.backbone.services.prefs;

import java.io.Serializable;
import java.util.Properties;

public final class UserPreference implements Serializable
{
	private static final long serialVersionUID = 1L;

	private Properties nvPair = null;

	public UserPreference()
	{
		this.nvPair = new Properties();
	}

	public UserPreference(Properties properties)
	{
		this.nvPair = properties;
	}

	public String getValue(String name)
	{
		return nvPair.getProperty(name);
	}

	public void setValue(String name, String value)
	{
		nvPair.setProperty(name, value);
	}

	public Properties getProperties()
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
		String nvPairAsStr = null;
		if (nvPair != null)
		{
			nvPairAsStr = nvPair.toString();
		}
		return nvPairAsStr;
	}
}
