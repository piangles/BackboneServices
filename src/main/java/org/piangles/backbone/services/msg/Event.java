package org.piangles.backbone.services.msg;

import java.io.Serializable;

/**
 * This is the actual message that is sent on the control channel. In the minimum 
 * there will be atleast be one control channel per user. That control channel is
 * the one that will belong to the user. Products can define their own control channels
 * based on business logic.  
 * 
 * 
 * Good Will Hunting  
 * Will Hunting: "Well, I got her number. How do you like them apples?"
 */
public final class Event implements Serializable
{
	private static final long serialVersionUID = 1L;

	private EventType type;
	
	/**
	 * This uniquely identifies the message. And will override any previous message with
	 * the same primaryKey
	 */
	private String primaryKey;
	
	/**
	 * This will identify the type of payload and will be useful for deserialization
	 * message handlers that register for handling this type of payload.
	 */
	private String payloadType;
	
	/**
	 * The actual content that will need to be deserialized / decoded to a Java object by
	 * the ControlMessageHandlers in the Gateway service. 
	 */
	private Object payload;

	public Event(EventType type, String primaryKey, Object payload)
	{
		this.type = type;
		this.primaryKey = primaryKey;
		this.payloadType = payload.getClass().getName();
		this.payload = payload;
	}

	public EventType getType()
	{
		return type;
	}

	public String getPrimaryKey()
	{
		return primaryKey;
	}

	public String getPayloadType()
	{
		return payloadType;
	}

	public Object getPayload()
	{
		return payload;
	}

	public void setPayload(Object payload)
	{
		this.payload = payload;
	}

	@Override
	public String toString()
	{
		return "Message [type=" + type + ", primaryKey=" + primaryKey + ", payloadType=" + payloadType + ", payload=" + payload + "]";
	}
}
