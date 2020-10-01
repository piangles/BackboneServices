package org.piangles.backbone.services.msg;

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
	 * EntityIdType is used to look up the various entityIds and convert them to Topics.
	 * Product has to set up the Datastore table with the required entity(Type & Id) mappings.
	 * 
	 */
	private EntityIdType entityIdType;
	/**
	 * List of unique entityIds, interpretation of this is left for the Product.
	 * Ex: 
	 * UserIds - when individuals have to be notified. 
	 * GroupId - In event a new group chat is created.
	 * TopicNames - In the event the entityType is Topic
	 *  
	 */
	private List<String> entityIds = null;
	
	private Message message = null;
	
	public FanoutRequest(EntityIdType entityIdType, Message message)
	{
		this(entityIdType, new ArrayList<>(), message);
	}

	public FanoutRequest(EntityIdType entityIdType, List<String> entityIds, Message message)
	{
		this.entityIdType = entityIdType;
		this.entityIds = entityIds;
		this.message = message;
	}

	public EntityIdType getEntityIdType()
	{
		return entityIdType;
	}
	
	public List<String> getEntityIds()
	{
		return entityIds;
	}

	public Message getMessage()
	{
		return message;
	}
}