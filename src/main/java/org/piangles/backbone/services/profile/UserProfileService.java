package org.piangles.backbone.services.profile;

public interface UserProfileService
{
	public static final String NAME = UserProfileService.class.getSimpleName();
	
	/**
	 * Returns a userId which is system generated.
	 */
	public String createProfile(BasicUserProfile profile) throws UserProfileException;
	public String searchProfile(BasicUserProfile profile) throws UserProfileException;
	
	/**
	 * These are the only calls in this service that needs a valid session
	 */
	public BasicUserProfile getProfile(String userId) throws UserProfileException;
	public void updateProfile(String userId, BasicUserProfile profile) throws UserProfileException;
}
