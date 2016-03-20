package com.teamnexters.productattend;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductAttendController {

	@Autowired
	private ProductAttendService productAttendService;
}
