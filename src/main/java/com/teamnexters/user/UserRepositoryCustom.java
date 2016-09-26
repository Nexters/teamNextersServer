package com.teamnexters.user;

import java.util.List;

public interface UserRepositoryCustom {
	List<UserEntity> getUsersByGener(int gener);
	List<Integer> getGeneragtions();
	List<UserEntity> getAllUserList();
}
