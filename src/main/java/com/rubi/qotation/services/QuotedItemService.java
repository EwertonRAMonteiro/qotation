package com.rubi.qotation.services;

import com.rubi.qotation.entities.QuotedItem;
import com.rubi.qotation.repositories.QuotedItemRepository;
import org.springframework.stereotype.Service;

@Service
public class QuotedItemService {

    private final QuotedItemRepository quotedItemRepo;

    public QuotedItemService(QuotedItemRepository quotedItemRepo) {
        this.quotedItemRepo = quotedItemRepo;
    }

    private QuotedItem save(QuotedItem quotedItem) {
        return quotedItemRepo.save(quotedItem);
    }
}
