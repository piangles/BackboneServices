package com.TBD.backbone.services.ctrl;

/**
 * Class that describes the Type and Id of the entity.
 * A combinatin of this is how Topics are read from datastore.
 * Type can be UserId / Alias or anything else the actual product deems.
 * Id the unique identifier for that entity.
 * 
 * 
 * The People vs. Larry Flynt
 * At the heart of the First Amendment is the recognition of the fundamental importance 
 * of the free flow of ideas, freedom to speak one's mind is not only an aspect of an 
 * individual liberty but is essential to the quest for truth and the vitality of society as a whole, 
 * in the world of debate about public affairs many things done with motives that are less than 
 * admirable are none of the less protected by the first amendment.
 *  
 *  - Alan Isaacman quotes Justice Antonin Scalia
 */
public class Entity
{
	private String type;
	private String id;
	
	public Entity(String type, String id)
	{
		this.type = type;
		this.id = id;
	}

	public String getType()
	{
		return type;
	}

	public String getId()
	{
		return id;
	}
}
