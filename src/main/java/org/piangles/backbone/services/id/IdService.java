package org.piangles.backbone.services.id;

public interface IdService
{
	public Identifier getNextIdentifier(String idType) throws IdException;
}
