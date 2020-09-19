package com.TBD.backbone.services.ctrl;

import java.util.List;

public interface ControlChannelService
{
	public List<String> getTopicsFor(String userId) throws ControlChannelException;
	public List<String> getTopicsForAliases(List<String> aliases) throws ControlChannelException;
	public void fanOut(FanoutRequest fanoutRequest)  throws ControlChannelException;
}
