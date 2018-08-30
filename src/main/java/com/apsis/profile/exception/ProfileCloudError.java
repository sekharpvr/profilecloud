package com.apsis.profile.exception;
/**
 * Exception class for Profile Cloud application.
 * @author sekhar
 *
 */
public class ProfileCloudError {

	private String errorMessage;

	public ProfileCloudError(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public String getErrorMessage() {
		return errorMessage;
	}
}
