package org.piangles.backbone.services.feature;

import java.io.Serializable;

public final class UpdateFeatureRequest implements Serializable {

	private static final long serialVersionUID = 1L;

	private final String groupId;
	private final String featureId;
	private final boolean enabled;

	public UpdateFeatureRequest(String groupId, String featureId, boolean enabled) {
		this.groupId = groupId;
		this.featureId = featureId;
		this.enabled = enabled;
	}

	public String getGroupId() {
		return groupId;
	}

	public String getFeatureId() {
		return featureId;
	}

	public boolean isEnabled() {
		return enabled;
	}
}
