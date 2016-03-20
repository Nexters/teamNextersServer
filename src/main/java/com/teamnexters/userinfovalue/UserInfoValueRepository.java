package com.teamnexters.userinfovalue;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserInfoValueRepository extends JpaRepository<UserInfoValueEntity,UserInfoValueKey>{

}
