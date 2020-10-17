package org.piangles.backbone.services.auth;

public interface AuthenticationService
{
	public boolean createAuthenticationEntry(Credential credential) throws AuthenticationException;
	
	public AuthenticationResponse authenticate(Credential credential) throws AuthenticationException;

	public AuthenticationResponse changePassword(String userId, String oldPassword, String newPassword) throws AuthenticationException;

	public void generateResetToken(String loginId) throws AuthenticationException;
	
	public AuthenticationResponse validatePasswordStrength(String password) throws AuthenticationException;
}
