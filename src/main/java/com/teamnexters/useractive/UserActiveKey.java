package com.teamnexters.useractive;

import java.io.Serializable;

import lombok.Data;

import com.teamnexters.user.UserEntity;

@Data
public class UserActiveKey implements Serializable{

	private UserEntity activeUser;
	
	private int gener;
}