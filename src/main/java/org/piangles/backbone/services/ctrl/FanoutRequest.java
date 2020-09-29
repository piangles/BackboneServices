package org.piangles.backbone.services.ctrl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * This is a request issued by Product services to fanout a control message
 * on control channels for entities specified in the list. 
 *
 * All fields are mandatory.
 *
 * Planes, Trains and Automobiles
 * Neal Page: ...Del? Why did you kiss my ear?
 * Del Griffith: ...Why are you holding my hand? 
 * Neal Page: ...Where's your OTHER hand?
 * Del Griffith: ...Between two pillows...
 * Neal Page: ...Those aren't pillows!
 * Del Griffith: Aaaaaahhh!
 */
public final class FanoutRequest implements Serializable
{
	private static final long serialVersionUID = 1L;
	/**
	 * A special type of entity where by the service interprets the entityIds as Topics itself.
	 */
	public static String ENTITY_TYPE_TOPIC = "Topic";
	/**
	 * Entity Type is used to look up the various entityIds and convert them to Topics.
	 * Product has to set up the Datastore table with the required entity(Type & Id) mappings.
	 * 
	 */
	private String entityType;
	/**
	 * List of unique entityIds, interpretation of this is left for the Product.
	 * Ex: 
	 * UserIds - when individuals have to be notified. 
	 * GroupId - In event a new group chat is created.
	 * TopicNames - In the event the entityType is Topic
	 *  
	 */
	private List<String> entityIds;
	/**
	 * This will be uniquely identiying the Type of ControlMessage create from this request.
	 * Each Type of ControlMessage will have an unique ControlMessageHandler 
	 */
	private String messageType;

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

	/**
	 * Create a request with an empty list of EntityIds.
	 * 
	 * @param entityType
	 * @param messageType
	 * @param action
	 * @param primaryKey
	 * @param payload
	 */
	public FanoutRequest(String entityType, String messageType, Action action, String primaryKey, String payload)
	{
		this(entityType, new ArrayList<>(), messageType, action, primaryKey, payload);
	}

	public FanoutRequest(String entityType, List<String> entityIds, String messageType, Action action, String primaryKey, String payload)
	{
		this.entityType = entityType;
		this.entityIds = entityIds;
		this.messageType = messageType;
		this.action = action;
		this.primaryKey = primaryKey;
		this.payload = payload;
	}

	public String getEntityType()
	{
		return entityType;
	}

	public List<String> getEntityIds()
	{
		return entityIds;
	}

	public String getMessageType()
	{
		return messageType;
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
