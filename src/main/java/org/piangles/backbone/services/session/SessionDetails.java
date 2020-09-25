package org.piangles.backbone.services.session;

import java.io.Serializable;
import java.util.Date;

public class SessionDetails implements Serializable
{
	private static final long serialVersionUID = 1L;
	
	private String userId = null;
	private String sessionId = null;
	private Date createdTS = null;
	private Date lastAccessedTS = null;
	
	public SessionDetails(String userId, String sessionId)
	{
		super();
		this.userId = userId;
		this.sessionId = sessionId;
		this.createdTS = new Date();
		this.lastAccessedTS = createdTS;
	}

	public String getUserId()
	{
		return userId;
	}

	public String getSessionId()
	{
		return sessionId;
	}

	public Date getCreatedTS()
	{
		return createdTS;
	}

	public Date getLastAccessedTS()
	{
		return lastAccessedTS;
	}
	
	public void touch()
	{
		this.lastAccessedTS = new Date();
	}

	@Override
	public String toString()
	{
		return "SessionDetails [userId=" + userId + ", sessionId=" + sessionId + ", createdTS=" + createdTS + ", lastAccessedTS=" + lastAccessedTS + "]";
	}
}
