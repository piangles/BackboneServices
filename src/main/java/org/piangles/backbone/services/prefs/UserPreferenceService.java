package org.piangles.backbone.services.prefs;

public interface UserPreferenceService
{
	public UserPreference retrieveUserPreference(String userId) throws UserPreferenceException;
	
	public void persistUserPreference(String userId, UserPreference prefs) throws UserPreferenceException;
}
