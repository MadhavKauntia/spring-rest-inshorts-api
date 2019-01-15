package com.springdemo.rest;

public class InvalidCategoryException extends RuntimeException {

	public InvalidCategoryException() {
		super();
	}

	public InvalidCategoryException(String arg0, Throwable arg1, boolean arg2, boolean arg3) {
		super(arg0, arg1, arg2, arg3);
	}

	public InvalidCategoryException(String arg0, Throwable arg1) {
		super(arg0, arg1);
	}

	public InvalidCategoryException(String arg0) {
		super(arg0);
	}

	public InvalidCategoryException(Throwable arg0) {
		super(arg0);
	}

}
