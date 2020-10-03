package org.piangles.backbone.services.msg;

import java.io.Serializable;

/**
 * This is the actual payload that is sent on the control channel. In the minimum 
 * there will be atleast be one control channel per user. That control channel is
 * the one that will belong to the user. Products can define their own control channels
 * based on business logic.  
 * 
 * The only time Control Messages should be sent are when changes to Key element(s) of
 * an Entity result in Subscription actions listed in actions.
 * 
 * All the fields are mandatory.
 * 
 * The Godfather
 * Don Vito Corleone: I'm going to make him an offer he can't refuse.
 */
public final class ControlDetails implements Serializable
{
	private static final long serialVersionUID = 1L;

	/**
	 * Should be unique across application and correspond to a
	 * ControlMessageHandler that processes these details
	 */
	private String type;
	
	private Action action;

	/**
	 * The actual content that will need to be interpreted by product as
	 * 1. Displayed to user
	 * 2. Actioned post Deserialized / Decoded
	 * 3. PassThru to UI
	 * 
	 * the interpretation of the content will be in the registered handlers in the Gateway service. 
	 */
	private String content;
	
	public ControlDetails(String type, Action action, String content)
	{
		this.type = type;
		this.action = action;
		this.content = content;
	}

	public String getType()
	{
		return type;
	}

	public Action getAction()
	{
		return action;
	}

	public String getContent()
	{
		return content;
	}

	@Override
	public String toString()
	{
		return "ControlDetails [type=" + type + ", action=" + action + ", content=" + content + "]";
	}
}
