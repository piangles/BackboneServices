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
 
 
 
package org.piangles.backbone.services.auth;

public interface AuthenticationService
{
	public static final String NAME = AuthenticationService.class.getSimpleName();
	
	public boolean doesAuthenticationEntryExist(String userId) throws AuthenticationException;
	
	public AuthenticationResponse createAuthenticationEntry(AuthenticationType type, Credential credential) throws AuthenticationException;
	
	public AuthenticationResponse authenticate(AuthenticationType type, Credential credential) throws AuthenticationException;

	/**
	 * This will be either an loginId, emailId or phoneNo.
	 */
	public AuthenticationResponse generateResetToken(String loginId) throws AuthenticationException;
	
	public AuthenticationResponse validatePasswordStrength(String password) throws AuthenticationException;

	/**
	 * This is the only call in this service that needs a valid session
	 */
	public AuthenticationResponse changePassword(String userId, String oldPassword, String newPassword) throws AuthenticationException;
}
