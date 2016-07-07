package com.teamnexters.user;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<UserEntity,String>, UserRepositoryCustom{

   public List<UserEntity> findByuserNoStartingWith(String userno);
   
}