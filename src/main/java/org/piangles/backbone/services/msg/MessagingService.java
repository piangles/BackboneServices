package org.piangles.backbone.services.msg;

import java.util.List;

public interface MessagingService
{
	public static final String NAME = MessagingService.class.getSimpleName();
	
	public Topic getTopic(String topicName) throws MessagingException;
	public List<Topic> getTopicsForUser(String userId) throws MessagingException;
	public List<Topic> getTopicsForAliases(List<String> aliases) throws MessagingException;
	public void publish(String topicName, Event event) throws MessagingException;
	public void fanOut(FanoutRequest fanoutRequest) throws MessagingException;
}
