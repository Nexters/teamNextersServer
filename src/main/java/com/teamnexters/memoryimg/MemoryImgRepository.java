package com.teamnexters.memoryimg;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MemoryImgRepository extends JpaRepository<MemoryImgEntity,MemoryImgKey>{

}
