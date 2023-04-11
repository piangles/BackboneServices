package org.piangles.backbone.services.feature;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public final class FeatureList implements Serializable
{
	private static final long serialVersionUID = 1L;
	
	private final String userId;
	private final List<Feature> features;

	public FeatureList(String userId)
	{
		this.userId = userId;
		this.features = new ArrayList<>();
	}

	public void addFeature(Feature feature)
	{
		this.features.add(feature);
	}

	public String getUserId()
	{
		return userId;
	}

	public List<Feature> getFeatures()
	{
		return features;
	}

	@Override
	public String toString()
	{
		return "FeatureList [userId=" + userId + ", features=" + features + "]";
	}
}
