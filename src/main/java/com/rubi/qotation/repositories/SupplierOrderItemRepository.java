package com.rubi.qotation.repositories;

import com.rubi.qotation.entities.SupplierOrderItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SupplierOrderItemRepository extends JpaRepository<SupplierOrderItem, Long> {
}
