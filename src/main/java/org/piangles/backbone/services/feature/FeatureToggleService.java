package org.piangles.backbone.services.feature;

public interface FeatureToggleService
{
	public static final String NAME = FeatureToggleService.class.getSimpleName();
	
	public FeatureList getFeatureList(String userId) throws FeatureException;
}
