package org.piangles.backbone.services.auth;

import java.io.Serializable;

public final class Credential implements Serializable
{
	private static final long serialVersionUID = 1L;
	
	private String id = null;//Could be one of [loginId, emailId, phoenNo or Token provided by [Proprietary or Public SSO Provider's Token]
	private String password = null;
	
	public Credential(String id, String password)
	{
		this.id = id;
		this.password = password;
	}

	public String getId()
	{
		return id;
	}

	public String getPassword()
	{
		return password;
	}
}
