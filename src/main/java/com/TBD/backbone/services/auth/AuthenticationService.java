package com.TBD.backbone.services.auth;

public interface AuthenticationService
{
	public AuthenticationResponse authenticate(String loginId, String password) throws AuthenticationException;
}
