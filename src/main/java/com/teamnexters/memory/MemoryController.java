package com.teamnexters.memory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MemoryController {

	@Autowired
	private MemoryService memoryService;
}
