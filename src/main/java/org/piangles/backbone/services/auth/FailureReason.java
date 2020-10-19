package org.piangles.backbone.services.auth;

public enum FailureReason
{
	InternalError,
	AuthenticationFailed,
	InvalidSession,
	AccountDisabled,
	TooManyAttempts,
	PasswordDoesNotMeetStrength;
}
