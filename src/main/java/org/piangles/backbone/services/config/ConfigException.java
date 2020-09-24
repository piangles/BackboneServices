package org.piangles.backbone.services.config;

public class ConfigException extends Exception
{
	public ConfigException(String message)
	{
		super(message);
	}

	public ConfigException(String message, Throwable cause)
	{
		super(message, cause);
	}

	public ConfigException(Throwable cause)
	{
		super(cause);
	}
}
