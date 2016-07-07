package com.teamnexters.product;


import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.Table;




import lombok.Data;



@Data
@Entity
@Table(name = "product", catalog = "nextershp")
public class ProductEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "prod_id")
	private int id;
	
	@Column(name = "prod_type")
	private String prodType;
	
	@Column(name = "prod_title")
	private String prodTitle;
	
	@Column(name = "prod_desc")
	private String prodDesc;
	
	@Column(name = "prod_link")
	private String prodLink;
	
	@Column(name = "prod_date")
	private Date prodDate;
}
