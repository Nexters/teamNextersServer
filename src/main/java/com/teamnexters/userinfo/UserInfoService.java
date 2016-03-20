package com.teamnexters.userinfo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserInfoService {

	@Autowired
	private UserInfoRepository userInfoRepository;
}
