package org.piangles.backbone.services.msg;

import java.util.List;

public interface MessagingService
{
	public List<Topic> getTopicsFor(String userId) throws MessagingException;
	public List<Topic> getTopicsForAliases(List<String> aliases) throws MessagingException;
	public void fanOut(FanoutRequest fanoutRequest) throws MessagingException;
}
