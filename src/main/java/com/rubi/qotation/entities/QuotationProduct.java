package com.rubi.qotation.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Table(name = "quotation_products")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class QuotationProduct {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "requested_quantity")
    private int requestedQuantity;

    @Column(name = "requested_brand")
    private String requestedBrand;

    @Column(name = "observations")
    private String observations;

    @ManyToOne
    @JoinColumn(name = "quotation_id", nullable = false)
    private Quotation quotation;

    @ManyToOne
    @JoinColumn(name = "product_id", nullable = false)
    private Product product;

}
