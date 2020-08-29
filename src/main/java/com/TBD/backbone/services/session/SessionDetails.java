package com.TBD.backbone.services.session;

import java.io.Serializable;

public class SessionDetails implements Serializable
{
	private static final long serialVersionUID = 1L;
	
	private String sessionId = null;
	
	public SessionDetails(String sessionId)
	{
		this.sessionId = sessionId;
	}
	
	public String getSessionId()
	{
		return sessionId;
	}
}
