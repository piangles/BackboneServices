package org.piangles.backbone.services.email;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EMailRequest implements Serializable
{
	private static final long serialVersionUID = 1L;
	private String from;
	private List<String> to;
	private String subject;
	private Map<String, String> nvPair;
	
	public EMailRequest()
	{
		this.to = new ArrayList<>();
		this.nvPair = new HashMap<>();
	}

	public EMailRequest setFrom(String from)
	{
		this.from = from;
		return this;
	}

	public EMailRequest addToRecipients(List<String> to)
	{
		this.to = to;
		return this;
	}

	public EMailRequest setSubject(String subject)
	{
		this.subject = subject;
		return this;
	}

	public EMailRequest addNVPair(String name, String value)
	{
		nvPair.put(name, value);
		return this;
	}

	public String getFrom()
	{
		return from;
	}

	public List<String> getTo()
	{
		return to;
	}

	public String getSubject()
	{
		return subject;
	}

	public Map<String, String> getNvPair()
	{
		return nvPair;
	}
}
