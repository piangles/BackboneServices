package org.piangles.backbone.services.msg;

/**
 * Entities can either be a direct Topic or an alias that
 * need to be translated to a topic using look up. It is the
 * callers /product developers responsibility to correctly design
 * if an entity should have a direct topic knowledge or alias.
 *
 * Hamlet
 * Hamlet: To be or not to be, that is the question. Whether 'tis nobler 
 * 			in the mind to suffer the slings and arrows of outrageous fortune, 
 * 			or take arms against a sea of troubles, and by opposing, end them.
 */
public enum DistributionListType
{
	Topic,
	Alias,
	Entity
}
