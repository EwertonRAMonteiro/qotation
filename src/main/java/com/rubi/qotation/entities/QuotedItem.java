package com.rubi.qotation.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name = "quoted_items")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class QuotedItem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "unit_value", nullable = false, precision = 10, scale = 2)
    private BigDecimal unitValue;

    @Column(name = "brand")
    private String brand;

    @Column(name = "observations", columnDefinition = "TEXT")
    private String observations;

    @Column(name = "has_item", nullable = false)
    private Boolean hasItem;

    @Column(name = "response_date", nullable = false)
    private LocalDateTime responseDate;

    @Column(name = "minimum_quantity")
    private Integer minimumQuantity;

    @ManyToOne
    @JoinColumn(name = "quotation_product_id", nullable = false)
    private QuotationProduct quotationProduct;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;
}
