package org.piangles.backbone.services.profile;

public interface UserProfileService
{
	public static final String NAME = UserProfileService.class.getSimpleName();
	
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
