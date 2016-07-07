package com.teamnexters.user;



import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;






import com.teamnexters.productattend.ProductAttendEntity;
import com.teamnexters.useractive.UserActiveEntity;
import com.teamnexters.userinfovalue.UserInfoValueEntity;




import lombok.Data;

@Data
@Entity
@Table(name = "user", catalog = "nextershp")
public class UserEntity{

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
	private String img;
	
	@OneToMany(fetch = FetchType.EAGER)
	@JoinColumn(name="user_no")
	private Set<UserInfoValueEntity> userInfoValues = new HashSet<UserInfoValueEntity>();
	
	@OneToMany(fetch = FetchType.EAGER)
	@JoinColumn(name="user_no")
	private Set<UserActiveEntity> userActives = new HashSet<UserActiveEntity>();
	
	@OneToMany(fetch = FetchType.EAGER)
	@JoinColumn(name="user_no")
	private Set<ProductAttendEntity> userProducts = new HashSet<ProductAttendEntity>();
	
	

}
