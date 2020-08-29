package com.TBD.backbone.services.logging;

public enum Category
{
	DEBUG(0),
	INFO(1),
	WARN(2),
	ERROR(3),
	FATAL(4);
	
	private int level = 0;
	
	private Category(int level)
	{
		this.level = level;
	}
	
	public int getLevel()
	{
		return level;
	}
}
