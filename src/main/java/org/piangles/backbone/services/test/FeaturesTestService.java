package org.piangles.backbone.services.test;

import java.util.stream.Stream;

public interface FeaturesTestService
{
	public static final String NAME = FeaturesTestService.class.getSimpleName();
	
	public Stream<Integer> getIntegerStream() throws FeaturesTestException;
}
