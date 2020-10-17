package org.piangles.backbone.services.id;

import java.io.Serializable;
import java.util.Date;

public final class Identifier implements Serializable
{
	private static final long serialVersionUID = 1L;
	
	private String value = null;
	private long generatedTimeStamp;
	private Date validTillDate = null; //null implies perpetual
	
	public Identifier(String value, long generatedTimeStamp, Date validTillDate)
	{
		this.value = value;
		this.generatedTimeStamp = generatedTimeStamp;
		this.validTillDate = validTillDate;
	}

	public String getValue()
	{
		return value;
	}

	public long getGeneratedTimeStamp()
	{
		return generatedTimeStamp;
	}

	public Date getValidTillDate()
	{
		return validTillDate;
	}

	@Override
	public String toString()
	{
		return "Identifier [value=" + value + ", generatedTimeStamp=" + generatedTimeStamp + ", validTillDate=" + validTillDate + "]";
	}
}
