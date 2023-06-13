package org.piangles.backbone.services.feature;

public interface FeatureManagementService
{
	public static final String NAME = FeatureManagementService.class.getSimpleName();
	
	public void addUserToGroup(String userId, String groupId) throws FeatureException;
	
	public void removeUserFromGroup(String userId, String groupId) throws FeatureException;
	
	public FeatureList getFeatureList(String userId) throws FeatureException;
}
