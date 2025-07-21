package com.rubi.qotation.services;

import com.rubi.qotation.entities.QuotedItem;
import com.rubi.qotation.entities.SupplierOrder;
import com.rubi.qotation.entities.SupplierOrderItem;
import com.rubi.qotation.repositories.SupplierOrderItemRepository;
import org.springframework.stereotype.Service;

@Service
public class SupplierOrderItemService {

    private final SupplierOrderItemRepository supplierOrderItemRepo;

    public SupplierOrderItemService(SupplierOrderItemRepository supplierOrderItemRepo) {
        this.supplierOrderItemRepo = supplierOrderItemRepo;
    }

    public SupplierOrderItem saveSupOrder(SupplierOrderItem supplierOrderItem) {
        return supplierOrderItemRepo.save(supplierOrderItem);
    }
}
