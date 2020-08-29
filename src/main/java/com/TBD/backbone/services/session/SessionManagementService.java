package com.TBD.backbone.services.session;

public interface SessionManagementService
{
	public SessionDetails register(String userId) throws SessionManagementException;
	public SessionDetails getSessionDetails(String userId) throws SessionManagementException;
	public void unregister(String userId) throws SessionManagementException;
	public boolean isValid(String userId, String sessionId) throws SessionManagementException;
}
