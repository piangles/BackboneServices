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
