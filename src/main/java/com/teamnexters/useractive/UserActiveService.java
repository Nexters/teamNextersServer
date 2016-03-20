package com.teamnexters.useractive;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserActiveService {

	@Autowired
	private UserActiveRepository userActiveRepository;
}
