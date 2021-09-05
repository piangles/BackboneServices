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
 
 
 
package org.piangles.backbone.services.profile;

import java.io.Serializable;

public class BasicUserProfile implements Serializable
{
	private static final long serialVersionUID = 1L;

	private String firstName = null;
	private String lastName = null;
	private String emailId = null;
	private boolean emailIdVerified = false;
	private String phoneNo = null;
	private boolean phoneNoVerified = false;

	public BasicUserProfile(String firstName, String lastName, String emailId, String phoneNo)
	{
		this(firstName, lastName, emailId, false, phoneNo, false);
	}

	public BasicUserProfile(String firstName, String lastName, String emailId, boolean emailIdVerified, String phoneNo, boolean phoneNoVerified)
	{
		this.firstName = firstName;
		this.lastName = lastName;
		this.emailId = emailId;
		this.emailIdVerified = emailIdVerified;
		this.phoneNo = phoneNo;
		this.phoneNoVerified = phoneNoVerified;
	}


	public String getFirstName()
	{
		return firstName;
	}

	public String getLastName()
	{
		return lastName;
	}

	public String getEMailId()
	{
		return emailId;
	}
	
	public boolean isEmailIdVerified()
	{
		return emailIdVerified;
	}

	public String getPhoneNo()
	{
		return phoneNo;
	}

	public boolean isPhoneNoVerified()
	{
		return phoneNoVerified;
	}
}
