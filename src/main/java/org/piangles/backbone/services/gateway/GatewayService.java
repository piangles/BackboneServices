package org.piangles.backbone.services.gateway;

public interface GatewayService 
{
	public static final String NAME = GatewayService.class.getSimpleName();
	
	public void init(GatewayConfiguration gatewayConfiguration) throws GatewayException;
	public void startProcessingRequests() throws GatewayException;
	public void closeAllConnections(String userId) throws GatewayException;

}
