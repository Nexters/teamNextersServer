package com.teamnexters.memoryimg;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MemoryImgService {

	@Autowired
	private MemoryImgRepository memoryImgRepository;
}
