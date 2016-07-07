package com.teamnexters.user;



import java.util.List;

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
	
	public List<UserEntity> getUsersByGener(int gener) {
		return userRepository.getUsersByGener(gener);
	}
	
	public List<UserEntity> getUsers() {
		return userRepository.findAll();
	}
	
	public List<Integer> getGenerations() {
		return userRepository.getGeneragtions();
	}
	
	public UserEntity getUserById(String id) {
		return userRepository.findOne(id);
	}
	
}