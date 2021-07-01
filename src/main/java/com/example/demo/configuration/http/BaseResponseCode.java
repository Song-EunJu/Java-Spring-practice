package com.example.demo.configuration.http;

public enum BaseResponseCode {

	SUCCESS(200), // 성공
	ERROR(500),
	;
	
	private int status;
	
	BaseResponseCode(int status){
		this.status = status;
	}
	
	public int status() {
		return status;
	}
	
}