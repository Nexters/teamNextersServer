package com.teamnexters.product;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

	@Autowired
	private ProductRepository productRepository;
	
	public List<ProductEntity> getAllProduct() {
		return productRepository.findAll();
	}
}
