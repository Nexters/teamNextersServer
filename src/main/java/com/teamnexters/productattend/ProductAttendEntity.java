package com.teamnexters.productattend;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.teamnexters.product.ProductEntity;

import lombok.Data;

@Data
@Entity
@IdClass(ProductAttendKey.class)
@Table(name = "product_attend", catalog = "nextershp")
public class ProductAttendEntity {

	@Id
	@Column(name="prod_id",insertable=false, updatable=false)
	private int prodId;
	
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name = "prod_id")
	private ProductEntity productAttend;
	
	@Id
	@Column(name = "user_no")
	private String userNo;
	
	@Column(name = "role")
	private int role;
	
	
	
}
