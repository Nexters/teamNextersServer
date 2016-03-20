package com.teamnexters.useractive;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserActiveController {

	@Autowired
	private UserActiveService userActiveService;
}
