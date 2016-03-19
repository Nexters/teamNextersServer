package com.teamnexters.user;

import lombok.Data;

@Data
public class UserDto {

	private String userNo;
	private String userId;
	private String userName;
	private String password;
	private int userBirth;
	private String userAuth;
	private long img;
}
