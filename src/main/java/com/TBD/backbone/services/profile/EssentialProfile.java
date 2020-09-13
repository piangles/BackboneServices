package com.TBD.backbone.services.profile;

import java.io.Serializable;

public class EssentialProfile implements Serializable	
{
	private String firstName = null;
	private String lastName = null;
	
	private String loginId = null; //This has to be emailId
	private String password = null;
	
	public EssentialProfile(String firstName, String lastName, String loginId, String password)
	{
		this.firstName = firstName;
		this.lastName = lastName;
		this.loginId = loginId;
		this.password = password;
	}

	public String getFirstName()
	{
		return firstName;
	}

	public String getLastName()
	{
		return lastName;
	}

	public String getLoginId()
	{
		return loginId;
	}

	public String getPassword()
	{
		return password;
	}
}
