package com.TBD.backbone.services.config;


public interface ConfigService
{
	public Configuration getConfiguration(String componentId) throws ConfigException;
}
