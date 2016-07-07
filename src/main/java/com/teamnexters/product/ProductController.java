package com.teamnexters.product;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.teamnexters.util.JsonUtil;

@RestController
public class ProductController {

	@Autowired
	private ProductService productService;
	
	@RequestMapping(value="/products/")
	public Map<String, Object> getProducts() {
		Map<String, Object> mapRslt = new HashMap<String, Object>();
		mapRslt.put("list", productService.getAllProduct());
		return JsonUtil.putSuccessJsonContainer(mapRslt);
	}
}
