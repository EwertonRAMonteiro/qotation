package com.rubi.qotation.services;

import com.rubi.qotation.entities.QuotationProduct;
import com.rubi.qotation.repositories.QuotationProductRepository;
import org.springframework.stereotype.Service;

@Service
public class QuotationProductService {

    private final QuotationProductRepository quotationProductRepo;

    public QuotationProductService(QuotationProductRepository quotationProductRepo) {
        this.quotationProductRepo = quotationProductRepo;
    }

    public QuotationProduct saveQuotationProduct(QuotationProduct quotationProduct) {
        return quotationProductRepo.save(quotationProduct);
    }
}
