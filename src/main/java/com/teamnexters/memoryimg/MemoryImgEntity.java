package com.teamnexters.memoryimg;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.teamnexters.memory.MemoryEntity;

import lombok.Data;


@Data
@Entity
@IdClass(MemoryImgKey.class)
@Table(name = "memory_img", catalog = "nextershp")
public class MemoryImgEntity {
	
	@Id
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "memId")
	private MemoryEntity memory;
	
	@Id
	@Column(name = "seq")
	private int seq;
	
	@Column(name = "img")
	private String img;

}
