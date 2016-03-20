package com.teamnexters.userinfovalue;

import com.teamnexters.user.UserEntity;
import com.teamnexters.userinfo.UserInfoEntity;
import java.io.Serializable;
import lombok.Data;

@Data
public class UserInfoValueKey implements Serializable{

	private UserEntity user;
	
	private UserInfoEntity userInfo;
}
