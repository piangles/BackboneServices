package org.piangles.backbone.services.auth;

public final class Credential
{
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
