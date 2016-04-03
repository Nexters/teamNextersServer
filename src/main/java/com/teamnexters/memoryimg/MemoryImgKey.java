package com.teamnexters.memoryimg;

import java.io.Serializable;

import com.teamnexters.memory.MemoryEntity;

import lombok.Data;

@Data
public class MemoryImgKey implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private MemoryEntity memory;
	
	private int seq;
}
