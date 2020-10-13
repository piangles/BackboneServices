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
	 * DistributionListType is used to look up the various entityIds and convert them to Topics.
	 * Product has to set up the Datastore table with the required entity(Type & Id) mappings.
	 * 
	 */
	private DistributionListType distributionListType;
	
	/**
	 * There can be many types of entities. There is always the possibility
	 * the same entityId needs to map for different topics for. The entityType
	 * classifies the purpose.
	 */
	private String entityType;
	/**
	 * Distribution List of entities this message has to be sent to interpretation of this 
	 * is left for the Product.
	 * Ex: 
	 * UserIds - when individuals have to be notified. 
	 * GroupId - In event a new group chat is created.
	 * TopicNames - In the event the entityType is Topic
	 *  
	 */
	private List<String> distributionList = null;
	
	private Event event = null;
	
	public FanoutRequest(DistributionListType distributionListType, Event event)
	{
		this(distributionListType, null, new ArrayList<>(), event);
	}

	public FanoutRequest(DistributionListType distributionListType, String entityType, Event event)
	{
		this(distributionListType, entityType, new ArrayList<>(), event);
	}

	public FanoutRequest(DistributionListType distributionListType, List<String> distributionList, Event event)
	{
		this(distributionListType, null, distributionList, event);
	}

	public FanoutRequest(DistributionListType distributionListType, String entityType, List<String> distributionList, Event event)
	{
		this.distributionListType = distributionListType;
		this.entityType = entityType;
		this.distributionList = distributionList;
		this.event = event;
	}

	public DistributionListType getDistributionListType()
	{
		return distributionListType;
	}
	
	public String getEntityType()
	{
		return entityType;
	}
	
	public List<String> getDistributionList()
	{
		return distributionList;
	}

	public Event getEvent()
	{
		return event;
	}
}
