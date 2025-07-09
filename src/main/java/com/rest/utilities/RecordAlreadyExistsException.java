package com.rest.utilities;

public class RecordAlreadyExistsException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public String getMessage() {
		return "Record already exists";
	}
	
	public String toString() {
		return "Exception:"+ getMessage();
	}
}
