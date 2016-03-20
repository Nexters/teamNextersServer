package com.teamnexters.useractive;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserActiveRepository extends JpaRepository<UserActiveEntity,UserActiveKey>{

}
