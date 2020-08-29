package com.TBD.backbone.services.prefs;

public class UserPreferenceException extends Exception
{
	private static final long serialVersionUID = 1L;

	public UserPreferenceException(String message)
	{
		super(message);
	}

	public UserPreferenceException(String message, Throwable cause)
	{
		super(message, cause);
	}

	public UserPreferenceException(Throwable cause)
	{
		super(cause);
	}
}