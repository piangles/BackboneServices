package org.piangles.backbone.services.feature;

import java.util.List;
import java.util.Map;

public interface FeatureToggleService
{
	public static final String NAME = FeatureToggleService.class.getSimpleName();
	
	public void addUserToGroup(String userId, String groupId) throws FeatureException;
	
	public void removeUserFromGroup(String userId, String groupId) throws FeatureException;
	
	public FeatureList getFeatureList(String userId) throws FeatureException;

    void updateFeature(UpdateFeatureRequest request) throws FeatureException;

	/**
	 * Method used to get all the groups along with the features inside each group
	 */
	Map<String, List<Feature>> getAllGroupsWithFeatures() throws FeatureException;

}
