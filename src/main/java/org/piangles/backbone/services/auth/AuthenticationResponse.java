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
 
 
 
package org.piangles.backbone.services.auth;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public final class AuthenticationResponse implements Serializable
{
	private static final long serialVersionUID = 1L;

	private String userId = null;
	private String token = null;
	private boolean validatedByToken = false;
	private int noOfAttemptsRemaining = 0;

	private boolean requestSuccessful = false;
	private FailureReason failureReason = null;
	private List<String> failureMessages = new ArrayList<>();
	private long lastLoggedInTimestamp = 0L;


	/**
	 * When authentication is sucessful.
	 * @param userId
	 * @param validatedByToken
	 */
	public AuthenticationResponse(String userId, boolean validatedByToken, long lastLoggedInTimestamp)
	{
		this.requestSuccessful = true;
		this.userId = userId;
		this.validatedByToken = validatedByToken;
		this.lastLoggedInTimestamp = lastLoggedInTimestamp;
	}


	/**
	 * Created only in one place when Token is generated.
	 * @param token
	 */
	public AuthenticationResponse(String userId, String token)
	{
		this.requestSuccessful = true;
		this.userId = userId;
		this.token = token;
	}


	public AuthenticationResponse(boolean requestSuccessful)
	{
		this.requestSuccessful = requestSuccessful;
	}

	public AuthenticationResponse(FailureReason failureReason, int noOfAttemptsRemaining)
	{
		this.requestSuccessful = false;
		this.failureReason = failureReason;
		this.noOfAttemptsRemaining = noOfAttemptsRemaining;
	}
	
	public void addFailureMessage(String failureMessage)
	{
		failureMessages.add(failureMessage);
	}
	
	public String getUserId()
	{
		return userId;
	}

	public String getToken()
	{
		return token;
	}

	public boolean isRequestSuccessful()
	{
		return requestSuccessful;
	}
	
	public boolean isAuthenticated()
	{
		return requestSuccessful;
	}

	public FailureReason getFailureReason()
	{
		return failureReason;
	}
	
	public int getNoOfAttemptsRemaining()
	{
		return noOfAttemptsRemaining;
	}
	
	public List<String> getFailureMessages()
	{
		return failureMessages;
	}

	public boolean IsValidatedByToken()
	{
		return validatedByToken;
	}
	
	public long getLastLoggedInTimestamp()
	{
		return lastLoggedInTimestamp;
	}

	@Override
	public String toString()
	{
		return "AuthenticationResponse [userId=" + userId + ", validatedByToken=" + validatedByToken + ", noOfAttemptsRemaining=" + noOfAttemptsRemaining + ", requestSuccessful=" + requestSuccessful
				+ ", failureReason=" + failureReason + ", failureMessages=" + failureMessages + "]";
	}
}
