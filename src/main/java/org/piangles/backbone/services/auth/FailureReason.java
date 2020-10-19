package org.piangles.backbone.services.auth;

public enum FailureReason
{
	InternalError,
	AuthenticationFailed,
	AccountDisabled,
	TooManyAttempts,
	PasswordDoesNotMeetStrength;
}
