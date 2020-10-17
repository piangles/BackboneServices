package org.piangles.backbone.services.profile;

public class UserProfileException extends Exception
{
	private static final long serialVersionUID = 1L;

	public UserProfileException()
	{
		super();
	}

	public UserProfileException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace)
	{
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public UserProfileException(String message, Throwable cause)
	{
		super(message, cause);
	}

	public UserProfileException(String message)
	{
		super(message);
	}

	public UserProfileException(Throwable cause)
	{
		super(cause);
	}
}
