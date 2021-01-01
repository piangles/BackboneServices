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

/**
 * 
 * This enumeration defines the actions the ChannelMessageHandler
 * are being requested to take.
 * 
 * The Product implementation should try and keep the interpretation of Action
 * similar to the framework.
 * The framework interpresents the actions as below
 * 
 * Add => Subscribe to a new Topic
 * Remove => Unsubscribe from an existing Topic
 * Invite => Pass the request to UI and notify the user an invitation to be added.
 * Inform => A simple notification to display for the user much like a balloon notification.
 * 
 * The Magnificent Seven (1960)
 * Chris: You forget one thing. We took a contract.
 * Vin: It's sure not the kind any court would enforce.
 * Chris: That's just the kind you've got to keep.
 * 
 * Sholay
 * Thakur: Loha garam hai ... maar do hathauda.
 * 

 * 
 */
public enum Action
{
	Add,
	Remove,
	Invite,
	Inform
}
