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
 
 
 
package org.piangles.backbone.services.session;

import java.util.List;

public interface SessionManagementService
{
	public static final String NAME = SessionManagementService.class.getSimpleName();
	
	//Called when the user is authenticated
	public SessionDetails register(String userId) throws SessionManagementException;
	
	public SessionDetails getSessionDetails(String userId, String sessionId) throws SessionManagementException;
	
	//Called when the user logs out or the session expires
	public void unregister(String userId, String sessionId) throws SessionManagementException;
	
	public boolean isValid(String userId, String sessionId) throws SessionManagementException;
	
	public void updateAuthenticationState(String userId, String sessionId, String authenticationState) throws SessionManagementException;
	
	public void makeLastAccessedCurrent(String userId, String sessionId) throws SessionManagementException;
	
	public void markForUnregister(String userId, String sessionId) throws SessionManagementException;
	
	//Administrative Functions
	public List<SessionDetails> getAllSessions(String userId) throws SessionManagementException;
	
	public void invalidateAllSessions(String userId) throws SessionManagementException;
}
