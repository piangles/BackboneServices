package org.piangles.backbone.services.email;

import java.util.Map;

public interface EMailService
{
	public static final String NAME = EMailService.class.getSimpleName();
	
	public void send(String templateId, Map<String, String> valueMap);
}
