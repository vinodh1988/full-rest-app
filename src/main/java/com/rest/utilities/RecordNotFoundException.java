package com.rest.utilities;

public class RecordNotFoundException extends Exception {

	private static final long serialVersionUID = 1L;

	public String getMessage() {
		return "Record not found";
	}
	
	public String toString() {
		return "Exception: " + getMessage();
	}

}
