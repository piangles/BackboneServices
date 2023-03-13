package org.piangles.backbone.services.feature;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public final class FeatureList implements Serializable
{
	private static final long serialVersionUID = 1L;
	
	private final String userId;
	private final String bizId;
	private final List<Feature> features;

	public FeatureList(String userId, String bizId)
	{
		this.userId = userId;
		this.bizId = bizId;
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

	public String getBizId()
	{
		return bizId;
	}
	
	public List<Feature> getFeatures()
	{
		return features;
	}

	@Override
	public String toString()
	{
		return "FeatureList [userId=" + userId + ", bizId=" + bizId + ", features=" + features + "]";
	}
}
