package org.piangles.backbone.services.auth;

public interface AuthenticationService
{
	public AuthenticationResponse createAuthenticationEntry(String userId, Credential credential) throws AuthenticationException;
	
	public AuthenticationResponse authenticate(Credential credential) throws AuthenticationException;

	public boolean generateResetToken(String loginId) throws AuthenticationException;
	
	public AuthenticationResponse validatePasswordStrength(String password) throws AuthenticationException;

	/**
	 * This is the only call in this service that needs a valid session
	 */
	public AuthenticationResponse changePassword(String userId, String oldPassword, String newPassword) throws AuthenticationException;
}
