package com.rubi.qotation.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Entity
@Table(name = "supplier_orders")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class SupplierOrder {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "total_value", nullable = false, precision = 12, scale = 2)
    private BigDecimal totalValue;

    @Column(name = "observations", columnDefinition = "TEXT")
    private String observations;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    @ManyToOne
    @JoinColumn(name = "quotation_id", nullable = false)
    private Quotation quotation;
}
