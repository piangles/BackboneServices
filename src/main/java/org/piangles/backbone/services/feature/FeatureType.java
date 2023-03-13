package org.piangles.backbone.services.feature;


/**
 * Philosophy -> Important 
 * -----------------------
 * 
 * Martin Fowler: 
 * "Feature toggle should be your last choice when you're dealing with putting features into production".
 * 
 * https://martinfowler.com/articles/feature-toggles.html
 * https://en.wikipedia.org/wiki/Feature_toggle
 * 
 * 
 * Philosophy is like Religion and Coffee
 * ======================================
 * 
 * 
 * >>>Too much of anything is not good.<<<
 * 
 * It is best to break the feature into smaller parts that each can be
 * implemented and safely introduced into the released product without 
 * causing other problems.
 * 
 * This 3 Options Below
 * --------------------
 */
public enum FeatureType
{
	/**
	 * As name suggest - It is Temporary, Feature is active and available 
	 * *BUT* not to all users. We are enabling to only a few -> In Production.
	 */
	Ephemeral,

	/**
	 * As the name suggests this flag is used for a feature that is behind
	 * a Paywall. 
	 */
	Paywall,

	/**
	 * As the name suggests this flag is used for experimenting a feature
	 * with a select audience. This enables us to make a larger decision 
	 * as to if this feature is to be invested in future.
	 * 
	 * Ex: A/B testing / Multivarative.
	 * https://www.optimizely.com/optimization-glossary/multivariate-test-vs-ab-test/
	 */
	Experimental;
}
