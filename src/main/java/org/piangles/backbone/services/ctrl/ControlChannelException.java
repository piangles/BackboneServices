package org.piangles.backbone.services.ctrl;

public class ControlChannelException extends Exception
{
	public ControlChannelException(String message)
	{
		super(message);
	}

	public ControlChannelException(String message, Throwable cause)
	{
		super(message, cause);
	}

	public ControlChannelException(Throwable cause)
	{
		super(cause);
	}
}
