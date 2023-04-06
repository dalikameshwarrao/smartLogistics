package com.smartlogistics.dto;

import lombok.Data;

@Data
public class UserDetailDTO {
	private String firstName;

	private String lastName;

	private String email;

	private String phoneNumber;

	private String password;

	private String deviceToken;
}
