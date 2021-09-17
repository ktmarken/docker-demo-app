package com.ex.dockerspringboothello.model;

public class Hello {

	private String id;
	private String message;
	
	public Hello() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Hello(String id, String message) {
		super();
		this.id = id;
		this.message = message;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	
}
