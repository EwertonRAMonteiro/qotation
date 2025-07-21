package com.rubi.qotation.services;

import com.rubi.qotation.entities.Product;
import com.rubi.qotation.repositories.ProductRepository;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

    private final ProductRepository productRepo;

    public ProductService(ProductRepository productRepo) {
        this.productRepo = productRepo;
    }

    public Product saveProduct(Product product) {
        return productRepo.save(product);
    }
}
