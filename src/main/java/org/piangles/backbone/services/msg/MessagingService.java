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

import java.util.List;

public interface MessagingService
{
	public static final String NAME = MessagingService.class.getSimpleName();
	
	public void createTopicFor(String entityType, String entityId) throws MessagingException;
	public List<Topic> getTopicsFor(String entityType, String entityId) throws MessagingException;

	public Topic getTopic(String topicName) throws MessagingException;
	public List<Topic> getTopicsForAliases(List<String> aliases) throws MessagingException;
	
	public void publish(String topicName, Event event) throws MessagingException;
	public void fanOut(FanoutRequest fanoutRequest) throws MessagingException;
}
