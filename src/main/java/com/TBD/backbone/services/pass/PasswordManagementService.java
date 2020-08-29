package com.TBD.backbone.services.pass;

/**
 * user unlock
 * authenticate
 * change password
 * generate resetToken
 * validate resetToken
 * Logout
 * 
 * AuthManagerHandler (omnistac)
 *
 */
public interface PasswordManagementService
{
	public void changePassword();
	public String forgotPassword();

	public String generateResetToken();
	public String valiateResetToken();
}
