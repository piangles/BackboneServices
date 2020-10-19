package org.piangles.backbone.services.auth;

import java.io.Serializable;
import java.util.List;

public final class AuthenticationResponse implements Serializable
{
	private static final long serialVersionUID = 1L;

	private String userId = null;
	private boolean validatedByToken = false;
	private int noOfAttemptsRemaining = 0;

	private boolean requestSuccessful = false;
	private FailureReason failureReason = null;
	private List<String> failureMessages = null;	

	public AuthenticationResponse(boolean requestSuccessful)
	{
		this.requestSuccessful = requestSuccessful;
	}

	public AuthenticationResponse(String userId, boolean validatedByToken)
	{
		this.requestSuccessful = true;
		this.userId = userId;
		this.validatedByToken = validatedByToken;
	}

	public AuthenticationResponse(FailureReason failureReason, int noOfAttemptsRemaining)
	{
		this.requestSuccessful = false;
		this.failureReason = failureReason;
		this.noOfAttemptsRemaining = noOfAttemptsRemaining;
	}

	public AuthenticationResponse(FailureReason failureReason, List<String> failureMessages)
	{
		this.requestSuccessful = false;
		this.failureReason = failureReason;
		this.failureMessages = failureMessages;
	}

	public String getUserId()
	{
		return userId;
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

	@Override
	public String toString()
	{
		return "AuthenticationResponse [userId=" + userId + ", validatedByToken=" + validatedByToken + ", noOfAttemptsRemaining=" + noOfAttemptsRemaining + ", requestSuccessful=" + requestSuccessful
				+ ", failureReason=" + failureReason + ", failureMessages=" + failureMessages + "]";
	}
}
