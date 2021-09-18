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
import java.util.UUID;

/**
 * This is the actual message that is sent on the control channel. In the minimum 
 * there will be atleast be one control channel per user. That control channel is
 * the one that will belong to the user. Products can define their own control channels
 * based on business logic.  
 * 
 * 
 * Good Will Hunting  
 * Will Hunting: "Well, I got her number. How do you like them apples?"
 */
public final class Event implements Serializable
{
	private static final long serialVersionUID = 1L;

	private UUID traceId = null;
	
	private String eventType;
	
	/**
	 * This uniquely identifies the message. And will override any previous message with
	 * the same primaryKey
	 */
	private String primaryKey;
	
	/**
	 * This will identify the type of payload and will be useful for deserialization
	 * message handlers that register for handling this type of payload.
	 */
	private String payloadType;
	
	/**
	 * The actual content that will need to be deserialized / decoded to a Java object by
	 * the ControlMessageHandlers in the Gateway service. 
	 */
	private Object payload;

	public Event(String eventType, String primaryKey, Object payload)
	{
		this.eventType = eventType;
		this.primaryKey = primaryKey;
		this.payloadType = payload.getClass().getName();
		this.payload = payload;
	}

	public String getEventType()
	{
		return eventType;
	}

	public String getPrimaryKey()
	{
		return primaryKey;
	}

	public String getPayloadType()
	{
		return payloadType;
	}

	public Object getPayload()
	{
		return payload;
	}

	public void setPayload(Object payload)
	{
		this.payload = payload;
	}

	public void setTraceId(UUID traceId)
	{
		this.traceId = traceId;
	}

	@Override
	public String toString()
	{
		return "Event [traceId=" + traceId + ", eventType=" + eventType + ", primaryKey=" + primaryKey + ", payloadType=" + payloadType + ", payload=" + payload + "]";
	}
}
