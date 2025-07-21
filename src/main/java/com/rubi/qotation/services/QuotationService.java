package com.rubi.qotation.services;

import com.rubi.qotation.entities.Quotation;
import com.rubi.qotation.repositories.QuotationRepository;
import org.springframework.stereotype.Service;

@Service
public class QuotationService {

    private final QuotationRepository quotationRepo;

    public QuotationService( QuotationRepository quotationRepo) {
        this.quotationRepo = quotationRepo;
    }

    public Quotation saveQuotation(Quotation quotation) {
       return quotationRepo.save(quotation);
    }
}
