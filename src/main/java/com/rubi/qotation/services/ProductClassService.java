package com.rubi.qotation.services;

import com.rubi.qotation.entities.ProductClass;
import com.rubi.qotation.repositories.ProductClassRepository;
import org.springframework.stereotype.Service;

@Service
public class ProductClassService {

    private final ProductClassRepository productClassRepo;

    public ProductClassService(ProductClassRepository productClassRepo) {
        this.productClassRepo = productClassRepo;
    }

    public ProductClass saveProductClass(ProductClass productClass) {
        return productClassRepo.save(productClass);
    }
}
