package com.teamnexters.productattend;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductAttendRepository extends JpaRepository<ProductAttendEntity,ProductAttendKey>{

}
