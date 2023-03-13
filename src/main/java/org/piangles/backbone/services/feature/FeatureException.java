package org.piangles.backbone.services.feature;

public class FeatureException extends Exception
{

	private static final long serialVersionUID = 1L;

	public FeatureException()
	{
		super();
	}

	public FeatureException(String arg0, Throwable arg1, boolean arg2, boolean arg3)
	{
		super(arg0, arg1, arg2, arg3);
	}

	public FeatureException(String arg0, Throwable arg1)
	{
		super(arg0, arg1);
	}

	public FeatureException(String arg0)
	{
		super(arg0);
	}

	public FeatureException(Throwable arg0)
	{
		super(arg0);
	}

}
