package com.teamnexters.user;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;


import lombok.Data;

@Data
@Entity
@Table(name = "user", catalog = "nextershp")
public class UserEntity implements Serializable{

	@Id
	@Column(name = "user_no",  unique = true, nullable = false)
	private String userNo;
	
	

	@Column(name = "user_id")
	private String userId;
	
	@Column(name = "user_name")
	private String userName;
	
	@Column(name = "password")
	private String password;
	
	
	@Column(name = "user_birth")
	private int userBirth;
	
	
	@Column(name = "user_auth")
	private String userAuth;
	
	@Column(name = "user_img")
	private long img;
	

	
	

}
