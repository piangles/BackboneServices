package org.piangles.backbone.services.id;

public interface IdService
{
	public static final String NAME = IdService.class.getSimpleName();
	
	public Identifier getNextIdentifier(String idType) throws IdException;
}
