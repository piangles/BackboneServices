package org.piangles.backbone.services.prefs;

public interface UserPreferenceService
{
	public static final String NAME = UserPreferenceService.class.getSimpleName();
	
	public UserPreference retrieveUserPreference(String userId) throws UserPreferenceException;
	
	public void persistUserPreference(String userId, UserPreference prefs) throws UserPreferenceException;
}
