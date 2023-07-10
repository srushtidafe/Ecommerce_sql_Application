package com.geekster.EcommerceApplication.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Product {
    @Id
    private Long productId;

    private String prodName;

    private Integer prodPrice;

    private String prodDescription;

    private String prodCategory;

    private String prodBrand;


}
