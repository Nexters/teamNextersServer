package com.teamnexters.productattend;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.teamnexters.product.ProductEntity;
import com.teamnexters.user.UserEntity;

import lombok.Data;






@Data
@Entity
@IdClass(ProductAttendKey.class)
@Table(name = "product_attend", catalog = "nextershp")
public class ProductAttendEntity {

	@Id
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "product_id")
	private ProductEntity productAttend;
	
	@Id
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "user_no")
	private UserEntity productUser;
	
	@Column(name = "role")
	private int role;
	
	
	
}
