package com.java.springboot.Demo.HrmsProject.core.utilities.result;

public class ErrorResult extends Result{

	public ErrorResult() {
		super(false);
	}
	
	public ErrorResult(String message) {
		super(false, message);
	}
}
