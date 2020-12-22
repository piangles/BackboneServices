package org.piangles.backbone.services.auth;

public enum FailureReason
{
	InternalError,
	AccountDoesNotExist,
	AuthenticationFailed,
	InvalidSession,
	AccountDisabled,
	TooManyAttempts,
	PasswordDoesNotMeetStrength;
}
