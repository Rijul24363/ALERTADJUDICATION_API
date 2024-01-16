package com.cf.manipal.api.exception;

/**
 */
public class AlertNotFoundException extends Exception {

	private static final long serialVersionUID = -7139304880555402679L;
	
	public AlertNotFoundException(){
		super();
	}
	
	public AlertNotFoundException(String msg){
		super(msg);
	}
	
	public AlertNotFoundException(String msg, Throwable cause){
		super(msg, cause);
	}

}
