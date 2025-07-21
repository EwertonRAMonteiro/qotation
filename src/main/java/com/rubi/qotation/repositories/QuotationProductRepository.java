package com.rubi.qotation.repositories;

import com.rubi.qotation.entities.QuotationProduct;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface QuotationProductRepository extends JpaRepository<QuotationProduct, Long> {
}
