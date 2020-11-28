package org.piangles.backbone.services.msg;

public interface Stream
{
	public void start() throws MessagingException;
	public void send(Object obj) throws MessagingException;
	public void finish() throws MessagingException;
}
