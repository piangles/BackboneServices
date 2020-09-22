package com.TBD.backbone.services.ctrl;

public class Topic
{
	public static int NOT_PARTIONED = -1;
	private String topicName;
	private int partitionNo;
	
	public Topic(String topic)
	{
		this(topic, NOT_PARTIONED);
	}

	public Topic(String topicName, int partitionNo)
	{
		this.topicName = topicName;
		this.partitionNo = partitionNo;
	}
	
	public String getTopicName()
	{
		return topicName;
	}
	
	public int getPartitionNo()
	{
		return partitionNo;
	}

	public boolean isPartioned()
	{
		return partitionNo != -1;
	}
}
