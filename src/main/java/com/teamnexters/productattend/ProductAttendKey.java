package com.teamnexters.productattend;

import java.io.Serializable;

import com.teamnexters.product.ProductEntity;
import com.teamnexters.user.UserEntity;

import lombok.Data;

@Data
public class ProductAttendKey implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private ProductEntity productAttend;
	
	private UserEntity productUser;
}
