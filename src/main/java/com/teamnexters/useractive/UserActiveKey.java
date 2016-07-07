package com.teamnexters.useractive;

import java.io.Serializable;

import lombok.Data;


@Data
public class UserActiveKey implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String userNo;
	
	private int gener;
}
