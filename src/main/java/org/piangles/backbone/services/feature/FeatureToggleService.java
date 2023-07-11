package org.piangles.backbone.services.feature;

public interface FeatureToggleService
{
	public static final String NAME = FeatureToggleService.class.getSimpleName();
	
	public void addUserToGroup(String userId, String groupId) throws FeatureException;
	
	public void removeUserFromGroup(String userId, String groupId) throws FeatureException;
	
	public FeatureList getFeatureList(String userId) throws FeatureException;

    void updateFeature(UpdateFeatureRequest request) throws FeatureException;
}
