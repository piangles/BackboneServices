package org.piangles.backbone.services.feature;

import java.io.Serializable;

public final class Feature implements Serializable
{
	private static final long serialVersionUID = 1L;

	/**
	 * Should be unique and descriptive.
	 * 
	 * Specific Format: piangles-[fe|be|both]-feature_name
	 */
	private String featureId;

	private String description;
	
	private FeatureType featureType;

	/**
	 * Is this feature enabledn by default to begin with.
	 */
	private boolean enabled;
	
	/**
	 * Is this feature to be Viewable by the user?
	 */
	private boolean viewable;
	
	/**
	 * Is this feature Actionable by the user? If it is actionable it is certainly viewable.
	 */
	private boolean actionable;

	public Feature(String featureId, String description, FeatureType featureType, boolean enabled)
	{
		this(featureId, description, featureType, enabled, false, false);
	}

	public Feature(	String featureId, String description, FeatureType featureType, 
					boolean enabled, boolean viewable, boolean actionable)
	{
		this.featureId = featureId;
		this.description = description;
		this.featureType = featureType;
		
		this.enabled = enabled;
		
		this.viewable = viewable;
		this.actionable = actionable;
	}

	public void markViewable()
	{
		this.viewable = true;
	}

	public void markActionable()
	{
		this.actionable = true;
	}

	public String getFeatureId()
	{
		return featureId;
	}

	public String getDescription()
	{
		return description;
	}

	public FeatureType getFeatureType()
	{
		return featureType;
	}

	public boolean isEnabled()
	{
		return enabled;
	}

	public boolean isViewable()
	{
		return viewable;
	}

	public boolean isActionable()
	{
		return actionable;
	}

	@Override
	public String toString()
	{
		return "Feature [featureId=" + featureId + ", description=" + description + ", featureType=" + featureType + 
				", enabled=" + enabled + ", viewable=" + viewable + ", actionable=" + actionable + "]";
	}
}
