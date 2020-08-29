package com.TBD.backbone.services.id;

public interface IdService
{
	public String getNextIdentifier(String idType) throws IdException;
}
