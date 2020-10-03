package org.piangles.backbone.services.msg;

import java.io.Serializable;

/**
 * Topic on which the content will be published. 
 * The partition number is specifically for Kafka. 
 * 
 * The People vs. Larry Flynt
 * At the heart of the First Amendment is the recognition of the fundamental importance 
 * of the free flow of ideas, freedom to speak one's mind is not only an aspect of an 
 * individual liberty but is essential to the quest for truth and the vitality of society as a whole, 
 * in the world of debate about public affairs many things done with motives that are less than 
 * admirable are none of the less protected by the first amendment.
 *  
 *  - Alan Isaacman quotes Justice Antonin Scalia
 */
public class Topic implements Serializable
{
	private static final long serialVersionUID = 1L;
	private static int NOT_PARTIONED = -1;
	private String topicName;
	private int partition;
	
	public Topic(String topic)
	{
		this(topic, NOT_PARTIONED);
	}

	public Topic(String topicName, int partition)
	{
		this.topicName = topicName;
		this.partition = partition;
	}
	
	public String getTopicName()
	{
		return topicName;
	}
	
	public int getPartition()
	{
		return partition;
	}

	public boolean isPartioned()
	{
		return partition != NOT_PARTIONED;
	}

	@Override
	public String toString()
	{
		return "Topic [topicName=" + topicName + ", partition=" + partition + "]";
	}
}
