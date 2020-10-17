package org.piangles.backbone.services.auth;

import java.io.Serializable;

public final class AuthenticationResponse implements Serializable
{
	private static final long serialVersionUID = 1L;
	
	private boolean requestSuccessful = false;
	private FailureReason failureReason = null;
	private int noOfAttemptsRemaining = 0;
	private String userId = null;

	public AuthenticationResponse(String userId)
	{
		this.requestSuccessful = true;
		this.userId = userId;
	}

	public AuthenticationResponse(String userId, boolean requestSuccessful, FailureReason failureReason)
	{
		this.requestSuccessful = requestSuccessful;
		this.failureReason = failureReason;
	}

	public boolean isAuthenticated()
	{
		return requestSuccessful;
	}

	public FailureReason getFailureReason()
	{
		return failureReason;
	}

	public String getUserId()
	{
		return userId;
	}

	@Override
	public String toString()
	{
		return "AuthenticationResponse [authenticated=" + requestSuccessful + ", failureReason=" + failureReason + ", userId=" + userId + "]";
	}
}
