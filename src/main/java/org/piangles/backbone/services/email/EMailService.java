package org.piangles.backbone.services.email;

public interface EMailService
{
	public static final String NAME = EMailService.class.getSimpleName();
	
	public void send(String templateId, EMailRequest request);
}
