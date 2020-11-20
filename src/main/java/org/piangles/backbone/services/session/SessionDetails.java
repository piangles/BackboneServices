package org.piangles.backbone.services.session;

import java.io.Serializable;

public class SessionDetails implements Serializable
{
	private static final long serialVersionUID = 1L;
	
	private String userId = null;
	private String sessionId = null;
	private long createdTS;
	private long lastAccessedTS;
	
	public SessionDetails(String userId, String sessionId)
	{
		this.userId = userId;
		this.sessionId = sessionId;
		this.createdTS = System.currentTimeMillis();
		this.lastAccessedTS = createdTS;
	}

	public SessionDetails(String userId, String sessionId, long createdTS, long lastAccessedTS)
	{
		this.userId = userId;
		this.sessionId = sessionId;
		this.createdTS = createdTS;
		this.lastAccessedTS = lastAccessedTS;
	}

	public String getUserId()
	{
		return userId;
	}

	public String getSessionId()
	{
		return sessionId;
	}

	public long getCreatedTS()
	{
		return createdTS;
	}

	public long getLastAccessedTS()
	{
		return lastAccessedTS;
	}
	
	public void touch()
	{
		this.lastAccessedTS = System.currentTimeMillis();
	}

	@Override
	public String toString()
	{
		return "SessionDetails [userId=" + userId + ", sessionId=" + sessionId + ", createdTS=" + createdTS + ", lastAccessedTS=" + lastAccessedTS + "]";
	}
}
