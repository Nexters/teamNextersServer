package com.teamnexters.memory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MemoryService {

	@Autowired
	private MemoryRepository memoryRepository;
}
