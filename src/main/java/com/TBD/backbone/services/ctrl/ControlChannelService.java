package com.TBD.backbone.services.ctrl;

import java.util.List;

public interface ControlChannelService
{
	public List<Topic> getTopicsFor(String userId) throws ControlChannelException;
	public List<Topic> getTopicsForAliases(List<String> aliases) throws ControlChannelException;
	public void fanOut(FanoutRequest fanoutRequest)  throws ControlChannelException;
}
