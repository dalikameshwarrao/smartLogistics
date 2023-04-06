package com.smartlogistics.dto;

import lombok.Data;

@Data
public class LoginRequestDetails {

	private String email;

	private String passWord;
	
	private String deviceToken;
}
