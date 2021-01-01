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
 
 
 
package org.piangles.backbone.services.logging;

import java.io.Serializable;

public final class SystemInfo implements Serializable
{
	private static final long serialVersionUID = 1L;
	
	private String hostName = null;
	private String loginId = null;
	private String processName = null;
	private String processId = null;
	private String threadId = null; 
	
	public SystemInfo(String hostName, String loginId, String processName, String processId)
	{
		this(hostName, loginId, processName, processId, null);
	}

	public SystemInfo(String hostName, String loginId, String processName, String processId, String threadId)
	{
		this.hostName = hostName;
		this.loginId = loginId;
		this.processName = processName;
		this.processId = processId;
		this.threadId = threadId;
	}

	public String getHostName()
	{
		return hostName;
	}

	public String getLoginId()
	{
		return loginId;
	}

	public String getProcessName()
	{
		return processName;
	}

	public String getProcessId()
	{
		return processId;
	}

	public String getThreadId()
	{
		return threadId;
	}

	/**
	 * Taken from experience with Scala but limited only to one member.
	 */
	public SystemInfo cloneAndCopy(String threadId)
	{
		return new SystemInfo(hostName, loginId, processName, processId, threadId);
	}

	public String toString()
	{
		StringBuffer sb = new StringBuffer();
		sb.append("[");
		sb.append(hostName).append(" ");
		sb.append(loginId).append(" ");
		sb.append(processName).append(" ");
		sb.append(processId).append(" ");
		sb.append(threadId);
		sb.append("]");
		return sb.toString();
	}
}
