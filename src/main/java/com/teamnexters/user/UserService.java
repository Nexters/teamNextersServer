package com.teamnexters.user;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
@Service
public class UserService {

	@Autowired
    private UserRepository userRepository;
	
	public UserDto getUser(String id){
		
		UserEntity userEntity=userRepository.findOne(id);
		
		UserDto user= new UserDto();
		user.setUserId(userEntity.getUserId());
		user.setUserName(userEntity.getUserName());
		
		return user;
	}
}