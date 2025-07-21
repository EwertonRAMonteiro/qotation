package com.rubi.qotation.services;

import com.rubi.qotation.entities.SupplierOrder;
import com.rubi.qotation.repositories.SupplierOrderRepository;
import org.springframework.stereotype.Service;

@Service
public class SupplierOrderService {

    private final SupplierOrderRepository supplierOrderRepo;

    public SupplierOrderService(SupplierOrderRepository supplierOrderRepo) {
        this.supplierOrderRepo = supplierOrderRepo;
    }

    public SupplierOrder saveSupplierOrder(SupplierOrder supplierOrder) {
        return supplierOrderRepo.save(supplierOrder);
    }
}
