package org.piangles.backbone.services.auth;

public interface AuthenticationService
{
	public static final String NAME = AuthenticationService.class.getSimpleName();
	
	public AuthenticationResponse createAuthenticationEntry(String userId, Credential credential) throws AuthenticationException;
	
	public AuthenticationResponse authenticate(AuthenticationType type, Credential credential) throws AuthenticationException;

	/**
	 * This will be either an loginId, emailId or phoneNo.
	 */
	public boolean generateResetToken(String loginId) throws AuthenticationException;
	
	public AuthenticationResponse validatePasswordStrength(String password) throws AuthenticationException;

	/**
	 * This is the only call in this service that needs a valid session
	 */
	public AuthenticationResponse changePassword(String userId, String oldPassword, String newPassword) throws AuthenticationException;
}
