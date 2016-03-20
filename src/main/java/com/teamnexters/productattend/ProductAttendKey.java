package com.teamnexters.productattend;

import java.io.Serializable;

import com.teamnexters.product.ProductEntity;
import com.teamnexters.user.UserEntity;

import lombok.Data;

@Data
public class ProductAttendKey implements Serializable{

	private ProductEntity productAttend;
	
	private UserEntity productUser;
}
