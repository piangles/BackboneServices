package org.piangles.backbone.services.feature;

import java.util.List;
import java.util.Map;

public interface FeatureManagementService
{
	public static final String NAME = FeatureManagementService.class.getSimpleName();
	
	public void addUserToGroup(String userId, String groupId) throws FeatureException;
	
	public void removeUserFromGroup(String userId, String groupId) throws FeatureException;
	
	public FeatureList getFeatureList(String userId) throws FeatureException;
	
    public void updateFeature(UpdateFeatureRequest request) throws FeatureException;

	/**
	 * Method used to get all the groups along with the features inside each group
	 */
    public Map<String, List<Feature>> getAllGroupsWithFeatures() throws FeatureException;
	
}
