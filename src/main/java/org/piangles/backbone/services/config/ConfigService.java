package org.piangles.backbone.services.config;

public interface ConfigService
{
	public static final String NAME = ConfigService.class.getSimpleName();
	
	public Configuration getConfiguration(String componentId) throws ConfigException;
}
