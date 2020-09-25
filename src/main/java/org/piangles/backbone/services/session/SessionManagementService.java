package org.piangles.backbone.services.session;

public interface SessionManagementService
{
	//Called when the user is authenticated
	public SessionDetails register(String userId) throws SessionManagementException;
	
	//Called when the user logs out or the session expires
	public void unregister(String userId, String sessionId) throws SessionManagementException;
	
	public boolean isValid(String userId, String sessionId) throws SessionManagementException;
	
	public void makeLastAccessedCurrent(String userId, String sessionId) throws SessionManagementException;
}
