package com.teamnexters.product;

import org.joda.time.DateTime;

import lombok.Data;

@Data
public class ProudctDto {

	private int prodId;
	
	private String prodType;
	
	private String prodTitle;
	
	private String prodDesc;
	
	private String prodLink;
	
	private DateTime prodDate;
}
