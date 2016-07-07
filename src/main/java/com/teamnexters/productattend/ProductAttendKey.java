package com.teamnexters.productattend;

import java.io.Serializable;

import com.teamnexters.product.ProductEntity;

import lombok.Data;

@Data
public class ProductAttendKey implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private int prodId;
	
	private String userNo;
}
