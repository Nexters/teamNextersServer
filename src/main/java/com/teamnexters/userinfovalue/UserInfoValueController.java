package com.teamnexters.userinfovalue;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserInfoValueController {

	@Autowired
	private UserInfoValueService userInfoValueService;
}
