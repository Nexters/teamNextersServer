package com.teamnexters.userinfovalue;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;







import com.teamnexters.user.UserEntity;
import com.teamnexters.userinfo.UserInfoEntity;

import lombok.Data;



@Data
@Entity
@IdClass(UserInfoValueKey.class)
@Table(name = "user_info_value", catalog = "nextershp")
public class UserInfoValueEntity {

		
	@Id
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "user_no")
	private UserEntity user;
	
	@Id
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "info_id")
	private UserInfoEntity userInfo;
	
	@Column(name = "info_value")
	private String infoValue;
	
	
}
