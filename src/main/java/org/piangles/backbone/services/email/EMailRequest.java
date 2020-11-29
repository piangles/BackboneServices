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
	private List<String> toRecipients;
	private String subject;
	private Map<String, String> nvPair;
	
	public EMailRequest()
	{
		this.toRecipients = new ArrayList<>();
		this.nvPair = new HashMap<>();
	}

	public EMailRequest setFrom(String from)
	{
		this.from = from;
		return this;
	}

	public EMailRequest addToRecipients(String to)
	{
		this.toRecipients.add(to);
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

	//Getters
	public String getFrom()
	{
		return from;
	}

	public List<String> getToRecipients()
	{
		return toRecipients;
	}

	public String getSubject()
	{
		return subject;
	}

	public Map<String, String> getNVPair()
	{
		return nvPair;
	}
}
