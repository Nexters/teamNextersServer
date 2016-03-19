package com.teamnexters.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class UserController {

	@Autowired
	private UserService userService;
	
	@RequestMapping(value="/user/{id}")
	public UserDto getUser(@PathVariable String id){

		

		return userService.getUser(id);
	}
}