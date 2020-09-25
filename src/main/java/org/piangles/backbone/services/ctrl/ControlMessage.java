package org.piangles.backbone.services.ctrl;

/**
 * This is the actual message that is sent on the control channel. In the minimum 
 * there will be atleast be one control channel per user. That control channel is
 * the one that will belong to the user. Products can define their own control channels
 * based on business logic.  
 * 
 * All the fields are mandatory.
 * 
 * My Cousin Vinny  
 * Mona Lisa Vito: My biological clock is ticking like this, and the way this case is going, I ain't never getting married!
 */
public final class ControlMessage
{
	/**
	 * This will be uniquely identiying the type of ControlMessage much
	 * like an endpoint. There will only be one ControlMessageHandler which 
	 * registers for handling this message type.
	 */
	private String type;
	
	private Action action;
	/**
	 * This uniquely identifies the message. And will override any previous message with
	 * the same primaryKey
	 */
	private String primaryKey;
	/**
	 * The actual content that will need to be deserialized / decoded to a Java object by
	 * the ControlMessageHandlers in the Gateway service. 
	 */
	private String payload;
	
	public ControlMessage(String type, Action action, String primaryKey, String payload)
	{
		this.type = type;
		this.action = action;
		this.primaryKey = primaryKey;
		this.payload = payload;
	}

	public String getType()
	{
		return type;
	}

	public Action getAction()
	{
		return action;
	}

	public String getPrimaryKey()
	{
		return primaryKey;
	}

	public String getPayload()
	{
		return payload;
	}
}
