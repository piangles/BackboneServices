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
 * This will be classify the type of this message. Messages can be of two types
 * 
 * 1. ControlMessage is sent on the control channel/topics. In the minimum 
 * there will be atleast be one control channel per user. That control channel is
 * the one that will belong to the user. Products can define their own control channels
 * based on business logic.  
 * 
 * 2. NotificationMessage is sent on regular topics containing application data.
 * 
 * My Cousin Vinny  
 * Mona Lisa Vito: My biological clock is ticking like this, and the way this case is going, 
 * 					I ain't never getting married!
 */

public enum EventType
{
	Control,
	ApplicationRelated
}
