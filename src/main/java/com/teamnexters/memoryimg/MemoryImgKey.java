package com.teamnexters.memoryimg;

import java.io.Serializable;

import com.teamnexters.memory.MemoryEntity;

import lombok.Data;

@Data
public class MemoryImgKey implements Serializable{

	private MemoryEntity memory;
	
	private int seq;
}
