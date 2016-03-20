package com.teamnexters.memory;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.teamnexters.memoryimg.MemoryImgEntity;


import lombok.Data;



@Data
@Entity
@Table(name = "memory", catalog = "nextershp")
public class MemoryEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id",  unique = true, nullable = false)
	private int id;
	
	@Column(name = "title")
	private String title;
	
	@Column(name = "desc")
	private String desc;
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "memory" )
	private Set<MemoryImgEntity> memoryImgs = new HashSet<MemoryImgEntity>(0);
}
