package com.rubi.qotation.repositories;

import com.rubi.qotation.entities.ProductClass;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductClassRepository extends JpaRepository<ProductClass, Long> {
}
