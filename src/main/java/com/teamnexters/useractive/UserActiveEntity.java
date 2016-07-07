package com.teamnexters.useractive;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;


import lombok.Data;



@Data
@Entity
@IdClass(UserActiveKey.class)
@Table(name = "user_active", catalog = "nextershp")
public class UserActiveEntity {

	@Id
	@Column(name = "user_no")
	private String userNo;
	
	@Id
	@Column(name = "gener")
	private int gener;
	
	@Column(name = "completeYN")
	private String completeYN;
}
