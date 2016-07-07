package com.teamnexters.userinfovalue;

import com.teamnexters.userinfo.UserInfoEntity;
import java.io.Serializable;
import lombok.Data;

@Data
public class UserInfoValueKey implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String userNo;
	
	private UserInfoEntity userInfo;
}
