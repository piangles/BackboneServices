package org.piangles.backbone.services.auth;

import java.io.Serializable;

public final class Credential implements Serializable
{
	private static final long serialVersionUID = 1L;
	
	private String loginId = null;
	private String password = null;
	
	public Credential(String loginId, String password)
	{
		this.loginId = loginId;
		this.password = password;
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
