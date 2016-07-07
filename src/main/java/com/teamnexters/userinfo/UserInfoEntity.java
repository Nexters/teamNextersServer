package com.teamnexters.userinfo;

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

import com.teamnexters.userinfovalue.UserInfoValueEntity;

import lombok.Data;



@Data
@Entity
@Table(name = "user_info", catalog = "nextershp")
public class UserInfoEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "info_id",  unique = true, nullable = false)
	private int id;
	
	@Column(name = "info_name")
	private String infoName;
}
