package org.piangles.backbone.services.test;

import org.piangles.core.stream.Stream;

public interface FeaturesTestService
{
	public static final String NAME = FeaturesTestService.class.getSimpleName();
	
	public Stream<String> getStringSequences() throws FeaturesTestException;
}
