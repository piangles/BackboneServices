/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements. See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
 
 
 
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
 *  - Alan Isaacman quotes Justice William Rehnquist
 */
public class Topic implements Serializable
{
	private static final long serialVersionUID = 1L;
	
	public static int CUSTOM_PARTIONED = -1;
	private String topicName;
	private String purpose;
	private int partition;
	private boolean compacted = false;
	private boolean readEarliest = false;
	
	/**
	 * Created a topic which is not partitioned or compacted  
	 */
	public Topic(String topic)
	{
		this(topic, 0, false);
	}

	public Topic(String topicName, int partition)
	{
		this(topicName, partition, false);
	}

	public Topic(String topicName, int partition, boolean readEarliest)
	{
		this.topicName = topicName;
		this.partition = partition;
		this.readEarliest = readEarliest;
	}

	public Topic(String topicName, String purpose, int partition, boolean compacted, boolean earliest)
	{
		this.topicName = topicName;
		this.purpose = purpose;
		this.partition = partition;
		this.compacted = compacted;
	}

	public String getTopicName()
	{
		return topicName;
	}
	
	public String getPurpose()
	{
		return purpose;
	}
	
	public int getPartition()
	{
		return partition;
	}

	public boolean isCustomPartioned()
	{
		return partition == CUSTOM_PARTIONED;
	}

	public boolean isCompacted()
	{
		return compacted;
	}
	
	public boolean shouldReadEarliest()
	{
		return readEarliest;
	}

	/**
	 * The hashCode should not consider compacted nature of the topic.
	 * It should only consider topicName and partition.
	 */
	@Override
	public final int hashCode()
	{
		final int prime = 31;
		int result = 1;
		result = prime * result + partition;
		result = prime * result + ((topicName == null) ? 0 : topicName.hashCode());
		return result;
	}

	/**
	 * The equals should not consider compacted nature of the topic.
	 * It should only consider topicName and partition.
	 */
	@Override
	public final boolean equals(Object obj)
	{
		if (this == obj) return true;
		if (obj == null) return false;
		if (getClass() != obj.getClass()) return false;
		Topic other = (Topic) obj;
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
		return "Topic [topicName=" + topicName + ", partition=" + partition + ", compacted=" + compacted + ", readEarliest=" + readEarliest + "]";
	}
}
