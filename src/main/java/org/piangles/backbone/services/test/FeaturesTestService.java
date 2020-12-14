package org.piangles.backbone.services.test;

import java.util.stream.Stream;

public interface FeaturesTestService
{
	public Stream<Integer> getIntegerStream() throws FeaturesTestException;
}
