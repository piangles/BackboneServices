/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements. See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
 
 
 
package org.piangles.backbone.services.session;

import java.io.Serializable;

public class SessionDetails implements Serializable
{
	private static final long serialVersionUID = 1L;
	
	private String userId = null;
	private String sessionId = null;
	private long inactivityExpiryTimeInSeconds = 0L; 
	private long createdTS;
	private long lastAccessedTS;
	
	public SessionDetails(String userId, String sessionId, long inactivityExpiryTimeInSeconds)
	{
		this(userId, sessionId, inactivityExpiryTimeInSeconds, System.currentTimeMillis(), System.currentTimeMillis());
	}

	public SessionDetails(String userId, String sessionId, long inactivityExpiryTimeInSeconds, long createdTS, long lastAccessedTS)
	{
		this.userId = userId;
		this.sessionId = sessionId;
		this.inactivityExpiryTimeInSeconds = inactivityExpiryTimeInSeconds;
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
	
	public long getInactivityExpiryTimeInSeconds()
	{
		return inactivityExpiryTimeInSeconds;
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
