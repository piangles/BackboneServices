package com.TBD.backbone.services.logging;

import java.io.PrintWriter;
import java.io.Serializable;
import java.io.StringWriter;
import java.util.Date;
import java.util.UUID;

public final class LogEvent implements Serializable
{
	private static final long serialVersionUID = 1L;

	private UUID traceId = null;
	private Date loggedTimeStamp = null;
	private SystemInfo systemInfo = null;
	private Category category = null;
	private String className = null;
	private String lineNumber = null;
	private String message = null;
	private String exceptionStackTrace = null;

	public LogEvent(UUID traceId, SystemInfo systemInfo, Category category, String className, String lineNumber, Object message)
	{
		this (traceId,systemInfo, category, className, lineNumber, message, null);	
	}
	
	public LogEvent(UUID traceId, SystemInfo systemInfo, Category category, String className, String lineNumber, Object message, Throwable throwable)
	{
		this.traceId = traceId;
		this.loggedTimeStamp = new Date();
		this.systemInfo = systemInfo;
		this.category = category;
		this.className = className;
		this.lineNumber = lineNumber;
		if (message != null)
		{
			this.message = message.toString();
		}
		
		if (throwable != null)
		{
			if (throwable instanceof Exception)
			{
				StringWriter stackTrace = new StringWriter();
				((Exception)throwable).printStackTrace(new PrintWriter(stackTrace));
				exceptionStackTrace = stackTrace.toString(); 
			}
			else
			{
				exceptionStackTrace = throwable.toString();
				//this.throwable = throwable.getStackTrace(); //TODO
			}
		}
	}

	public UUID getTraceId()
	{
		return traceId;
	}
	
	public Date getLoggedTimeStamp()
	{
		return loggedTimeStamp;
	}

	public SystemInfo getSystemInfo()
	{
		return systemInfo;
	}

	public Category getCategory()
	{
		return category;
	}

	public String getClassName()
	{
		return className;
	}

	public String getLineNumber()
	{
		return lineNumber;
	}

	public String getMessage()
	{
		return message;
	}

	public String getExceptionStackTrace()
	{
		return exceptionStackTrace;
	}

	@Override
	public String toString()
	{
		StringBuffer sb = new StringBuffer();
		sb.append(traceId).append(" ");
		sb.append(loggedTimeStamp).append(" ");
		sb.append(systemInfo).append(" ");
		sb.append(category).append(" ");
		sb.append(className).append(" ");
		sb.append(lineNumber).append(" ");
		sb.append(message);
		if (exceptionStackTrace != null)
		{
			sb.append("\n");
			sb.append(exceptionStackTrace);
		}
		return sb.toString();
	}
}
