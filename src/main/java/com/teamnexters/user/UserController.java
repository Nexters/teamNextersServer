package com.teamnexters.user;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.teamnexters.util.JsonUtil;



@RestController
public class UserController {

	@Autowired
	private UserService userService;
	
	@RequestMapping(value="/gener/")
	public Map<String, Object> getUser(){
		Map<String, Object> rsltMap = new HashMap<String, Object>();
		rsltMap.put("list", userService.getGenerations());
		return JsonUtil.putSuccessJsonContainer(rsltMap);
	}
	
	@RequestMapping(value="/users/{gener}")
	public Map<String, Object> getUser(@PathVariable int gener){
		Map<String, Object> rsltMap = new HashMap<String, Object>();
		rsltMap.put("list", userService.getUsersByGener(gener));
		return JsonUtil.putSuccessJsonContainer(rsltMap);
	}
	
	@RequestMapping(value="/user/{id}")
	public Map<String, Object> getUser(@PathVariable String id){
		Map<String, Object> rsltMap = new HashMap<String, Object>();
		rsltMap.put("user", userService.getUserById(id));
		return JsonUtil.putSuccessJsonContainer(rsltMap);
	}
	
	@RequestMapping(value="/users/")
	public Map<String, Object> getUsers() {
		Map<String, Object> rsltMap = new HashMap<String, Object>();
		rsltMap.put("list", userService.getUsers());
		return JsonUtil.putSuccessJsonContainer(rsltMap);
	}
}