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
