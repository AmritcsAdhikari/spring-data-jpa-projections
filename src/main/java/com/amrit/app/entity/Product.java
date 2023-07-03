package com.amrit.app.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="product")
public class Product {

    @Id
    private Integer productId;

    private String productName;

    private Double productPrice;

    private String productCode;
}
