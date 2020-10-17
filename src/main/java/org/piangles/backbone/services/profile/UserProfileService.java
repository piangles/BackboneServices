package org.piangles.backbone.services.profile;

public interface UserProfileService
{
	/**
	 * Returns a userId which is system generated.
	 *  
	 * @param profile
	 * @return
	 * @throws UserProfileException
	 */
	public String createProfile(BasicUserProfile profile) throws UserProfileException;
	public BasicUserProfile getProfile(String userId) throws UserProfileException;
	public void updateProfile(String userId, BasicUserProfile profile) throws UserProfileException;
}
