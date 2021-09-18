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
 * This is the actual payload that is sent on the control channel. In the minimum 
 * there will be atleast be one control channel per user. That control channel is
 * the one that will belong to the user. Products can define their own control channels
 * based on business logic.  
 * 
 * The only time Control Messages should be sent are when changes to Key element(s) of
 * an Entity result in Subscription actions listed in actions.
 * 
 * All the fields are mandatory.
 * 
 * The Godfather
 * Don Vito Corleone: I'm going to make him an offer he can't refuse.
 */
public final class Control implements Serializable
{
	private static final long serialVersionUID = 1L;

	
	/**
	 * Should be unique across application and correspond to a
	 * ControlEventHandler that processes these details
	 */
	private String type;
	
	private Action action;

	private long expirationTime;

	/**
	 * The actual content that will need to be interpreted by product as
	 * 1. Displayed to user
	 * 2. Actioned post Deserialized / Decoded
	 * 3. PassThru to UI
	 * 
	 * the interpretation of the content will be in the registered handlers in the Gateway service. 
	 */
	private String content;
	
	public Control(String type, Action action, long expirationTime, String content)
	{
		this.type = type;
		this.action = action;
		this.expirationTime = expirationTime;
		this.content = content;
	}

	public String getType()
	{
		return type;
	}

	public Action getAction()
	{
		return action;
	}
	
	public long getExpirationTime()
	{
		return expirationTime;
	}

	public String getContent()
	{
		return content;
	}

	@Override
	public String toString()
	{
		return "ControlDetails [type=" + type + ", action=" + action + ", expirationTime=" + expirationTime + ", content=" + content + "]";
	}
}
