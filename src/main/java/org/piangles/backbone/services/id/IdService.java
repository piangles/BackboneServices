package org.piangles.backbone.services.id;

public interface IdService
{
	public String getNextIdentifier(String idType) throws IdException;
}
