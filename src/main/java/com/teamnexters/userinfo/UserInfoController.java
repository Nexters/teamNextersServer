package com.teamnexters.userinfo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserInfoController {

	@Autowired
	private UserInfoService userInfoService;
}
