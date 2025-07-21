package com.rubi.qotation.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Entity
@Table(name = "supplier_orders_items")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class SupplierOrderItem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "quantity", nullable = false, precision = 12, scale = 2)
    private BigDecimal quantity;

    @Column(name = "unit_value", nullable = false, precision = 12, scale = 2)
    private BigDecimal unitValue;

    @Column(name = "total_value", nullable = false, precision = 12, scale = 2)
    private BigDecimal totalValue;

    @Column(name = "observations", columnDefinition = "TEXT")
    private String observations;

    @ManyToOne
    @JoinColumn(name = "supplier_order_id", nullable = false)
    private SupplierOrder supplierOrder;

    @ManyToOne
    @JoinColumn(name = "product_id", nullable = false)
    private Product product;
}
