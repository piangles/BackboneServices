package org.piangles.backbone.services.feature;

import java.io.Serializable;

public final class Feature implements Serializable
{
	private static final long serialVersionUID = 1L;

	private String environment;//DEV/QAT/UAT/PROD

	/**
	 * Should be unique and descriptive.
	 * 
	 * Specific Format: zuro-[fe|be|both]-feature_name
	 */
	private String featureId;

	private String description;
	
	private FeatureType featureType;
	
	private boolean archived; //This feature toggle is archived and is not active.

	/**
	 * Is this feature to be Viewable by user?
	 */
	private boolean viewable;
	
	/**
	 * So the user can see it, but is it enabled? Corollary if it is is Enabled, Viewable is automatically true.
	 */
	private boolean enabled;
	
	/**
	 * So it is Enabled but is it Actionable? If it is actionable it is Enabled and certainly viewable.
	 */
	private boolean actionable;

	public Feature(	String environment, String featureId, String description, FeatureType featureType)
	{
		this(environment, featureId, description, featureType, false, true, true, true);
	}

	public Feature(	String environment, String featureId, String description, FeatureType featureType, 
					boolean viewable, boolean enabled, boolean actionable)
	{
		this(environment, featureId, description, featureType, false, viewable, enabled, actionable);
	}


	public Feature(	String environment, String featureId, String description, FeatureType featureType, 
			boolean archived, boolean viewable, boolean enabled, boolean actionable)
	{
		this.environment = environment;
		this.featureId = featureId;
		this.description = description;
		this.featureType = featureType;
		this.archived = archived;
		this.viewable = viewable;
		this.enabled = enabled;
		this.actionable = actionable;
	}

	public String getEnvironment()
	{
		return environment;
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

	public boolean isArchived()
	{
		return archived;
	}

	public boolean isViewable()
	{
		return viewable;
	}

	public boolean isEnabled()
	{
		return enabled;
	}

	public boolean isActionable()
	{
		return actionable;
	}

	@Override
	public String toString()
	{
		return "Feature [environment=" + environment + ", featureId=" + featureId + ", description=" + description + ", featureType=" + featureType + ", archived=" + archived + ", viewable="
				+ viewable + ", enabled=" + enabled + ", actionable=" + actionable + "]";
	}
}
