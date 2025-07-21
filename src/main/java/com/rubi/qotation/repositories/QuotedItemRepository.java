package com.rubi.qotation.repositories;

import com.rubi.qotation.entities.QuotedItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface QuotedItemRepository extends JpaRepository<QuotedItem, Long> {
}
