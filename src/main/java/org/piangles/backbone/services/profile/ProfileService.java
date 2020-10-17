package org.piangles.backbone.services.profile;

public interface ProfileService
{
	/**
	 * Returns a userId which is system generated.
	 *  
	 * @param profile
	 * @return
	 * @throws ProfileException
	 */
	public String createProfile(BasicUserProfile profile) throws ProfileException;
	public BasicUserProfile retrieveProfile(String userId) throws ProfileException;
	public boolean updateProfile(String userId, BasicUserProfile profile) throws ProfileException;
}
