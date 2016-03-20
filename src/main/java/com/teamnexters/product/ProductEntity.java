package com.teamnexters.product;

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

import org.joda.time.DateTime;

import com.teamnexters.productattend.ProductAttendEntity;


import lombok.Data;



@Data
@Entity
@Table(name = "product", catalog = "nextershp")
public class ProductEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "prod_id",  unique = true, nullable = false)
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
	private DateTime prodDate;
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "productAttend" )
	private Set<ProductAttendEntity> productAttends = new HashSet<ProductAttendEntity>(0);
}
