package org.piangles.backbone.services.feature;

public interface FeatureToggleService
{
	public static final String NAME = FeatureToggleService.class.getSimpleName();
	
	public FeatureList getFeatures(String userId, String bizId) throws FeatureException;
}
