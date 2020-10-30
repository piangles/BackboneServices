package org.piangles.backbone.services.logging;

public interface LoggingService
{
	public static final String NAME = LoggingService.class.getSimpleName();
	
	public void record(LogEvent logEvent);
	
	public void debug(Object message);

	public void debug(Object message, Throwable t);
	
	public void info(Object message);

	public void info(Object message, Throwable t);
	
	public void warn(Object message);

	public void warn(Object message, Throwable t);
	
	public void error(Object message);

	public void error(Object message, Throwable t);

	public void fatal(Object message);

	public void fatal(Object message, Throwable t);
}
