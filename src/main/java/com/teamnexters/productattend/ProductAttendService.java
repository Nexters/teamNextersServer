package com.teamnexters.productattend;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductAttendService {

	@Autowired
	private ProductAttendRepository productAttendRepository;
}
