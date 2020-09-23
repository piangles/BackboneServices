package com.TBD.backbone.services.ctrl;

/**
 * 
 * This enumeration defines the actions the ChannelMessageHandler
 * are being requested to take.
 * 
 * The Product implementation should try and keep the interpretation of Action
 * similar to the framework.
 * The framework interpresents the actions as below
 * 
 * Add => Subscribe to a new Topic
 * Remove => Unsubscribe from an existing Topic
 * Invite => Pass the request to UI and notify the user an invitation to be added.
 * Inform => A simple notification to display for the user much like a balloon notification.
 * 
 * The Magnificent Seven (1960)
 * Chris: You forget one thing. We took a contract.
 * Vin: It's sure not the kind any court would enforce.
 * Chris: That's just the kind you've got to keep.
 * 
 * Sholay
 * Thakur: Loha garam hai ... maar do hathauda.
 * 

 * 
 */
public enum Action
{
	Add,
	Remove,
	Invite,
	Inform
}
