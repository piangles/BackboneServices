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
	private boolean compacted;
	
	public Topic(String topic)
	{
		this(topic, NOT_PARTIONED, false);
	}

	public Topic(String topicName, int partition)
	{
		this(topicName, partition, false);
	}

	public Topic(String topicName, int partition, boolean compacted)
	{
		this.topicName = topicName;
		this.partition = partition;
		this.compacted = compacted;
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

	public boolean isCompacted()
	{
		return compacted;
	}

	@Override
	public int hashCode()
	{
		final int prime = 31;
		int result = 1;
		result = prime * result + (compacted ? 1231 : 1237);
		result = prime * result + partition;
		result = prime * result + ((topicName == null) ? 0 : topicName.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj)
	{
		if (this == obj) return true;
		if (obj == null) return false;
		if (getClass() != obj.getClass()) return false;
		Topic other = (Topic) obj;
		if (compacted != other.compacted) return false;
		if (partition != other.partition) return false;
		if (topicName == null)
		{
			if (other.topicName != null) return false;
		}
		else if (!topicName.equals(other.topicName)) return false;
		return true;
	}

	@Override
	public String toString()
	{
		return "Topic [topicName=" + topicName + ", partition=" + partition + ", compacted=" + compacted + "]";
	}
}
