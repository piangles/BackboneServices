package com.TBD.backbone.services.auth;

import java.io.Serializable;

public final class AuthenticationResponse implements Serializable
{
	private static final long serialVersionUID = 1L;
	
	private boolean authenticated = false;
	private FailureReason failureReason = null;
	private String userId = null;

	public AuthenticationResponse(String userId)
	{
		this.authenticated = true;
		this.userId = userId;
	}

	public AuthenticationResponse(boolean authenticated, FailureReason failureReason)
	{
		this.authenticated = authenticated;
		this.failureReason = failureReason;
	}

	public boolean isAuthenticated()
	{
		return authenticated;
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
		return "AuthenticationResponse [authenticated=" + authenticated + ", failureReason=" + failureReason + ", userId=" + userId + "]";
	}
}
