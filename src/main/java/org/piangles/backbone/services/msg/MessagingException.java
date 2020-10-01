package org.piangles.backbone.services.msg;

public class MessagingException extends Exception
{
	public MessagingException(String message)
	{
		super(message);
	}

	public MessagingException(String message, Throwable cause)
	{
		super(message, cause);
	}

	public MessagingException(Throwable cause)
	{
		super(cause);
	}
}
