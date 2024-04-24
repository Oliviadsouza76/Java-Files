package com.connect.social.main.page.SocialConnect.service;

public class ResponseObjectService {

	private String message;
	private String status;
	private Object payload;
	public ResponseObjectService(String message, String status, Object payload) {
		
		this.message = message;
		this.status = status;
		this.payload = payload;
	}
	
	
	public ResponseObjectService() {

	}

	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Object getPayload() {
		return payload;
	}
	public void setPayload(Object payload) {
		this.payload = payload;
	}
	
	
}
