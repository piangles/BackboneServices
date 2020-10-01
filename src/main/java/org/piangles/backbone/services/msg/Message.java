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
public final class Message implements Serializable
{
	private static final long serialVersionUID = 1L;

	private MessageType type;
	
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

	public Message(String primaryKey, ControlDetails payload)
	{
		this(MessageType.Control, primaryKey, payload.getClass().getName(), payload);
	}

	public Message(MessageType type, String primaryKey, Object payload)
	{
		this(type, primaryKey, payload.getClass().getName(), payload);
	}

	private Message(MessageType type, String primaryKey, String payloadType, Object payload)
	{
		this.type = type;
		this.primaryKey = primaryKey;
		this.payloadType = payloadType;
		this.payload = payload;
	}

	public MessageType getType()
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
}
