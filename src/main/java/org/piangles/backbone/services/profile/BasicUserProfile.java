package org.piangles.backbone.services.profile;

import java.io.Serializable;

public class BasicUserProfile implements Serializable
{
	private static final long serialVersionUID = 1L;

	private String firstName = null;
	private String lastName = null;
	private String emailId = null;
	private String phoneNo = null;

	public BasicUserProfile(String firstName, String lastName, String emailId, String phoneNo)
	{
		this.firstName = firstName;
		this.lastName = lastName;
		this.emailId = emailId;
		this.phoneNo = phoneNo;
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
	
	public String getPhoneNo()
	{
		return phoneNo;
	}
}
