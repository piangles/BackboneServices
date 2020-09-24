package org.piangles.backbone.services.session;

public class SessionManagementException extends Exception
{
	public SessionManagementException(String message)
	{
		super(message);
	}

	public SessionManagementException(String message, Throwable cause)
	{
		super(message, cause);
	}

	public SessionManagementException(Throwable cause)
	{
		super(cause);
	}
}
