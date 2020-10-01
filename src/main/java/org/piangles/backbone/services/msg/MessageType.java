package org.piangles.backbone.services.msg;

/**
 * This will be classify the type of this message. Messages can be of two types
 * 
 * 1. ControlMessage is sent on the control channel/topics. In the minimum 
 * there will be atleast be one control channel per user. That control channel is
 * the one that will belong to the user. Products can define their own control channels
 * based on business logic.  
 * 
 * 2. NotificationMessage is sent on regular topics containing application data.
 * 
 * My Cousin Vinny  
 * Mona Lisa Vito: My biological clock is ticking like this, and the way this case is going, 
 * 					I ain't never getting married!
 */

public enum MessageType
{
	Control,
	Notification
}
