package com.teamnexters.useractive;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;





import com.teamnexters.user.UserEntity;

import lombok.Data;



@Data
@Entity
@IdClass(UserActiveKey.class)
@Table(name = "user_active", catalog = "nextershp")
public class UserActiveEntity {

	@Id
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "user_no")
	private UserEntity activeUser;
	
	@Id
	@Column(name = "gener")
	private int gener;
	
	@Column(name = "completeYN")
	private String completeYN;
}
