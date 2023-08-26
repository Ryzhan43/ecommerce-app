package com.mryzhan.ecommerceapp.entity;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.List;

public class Product extends BaseEntity{
    private String name;
    private BigDecimal price;
    private Integer quantity;
    private Integer remainingQuantity;


    @ManyToMany
    @JoinTable(name = "product_category_rel",
            joinColumns = @JoinColumn(name = "p_id"),
            inverseJoinColumns = @JoinColumn(name = "c_id"))
    private List<Category> productList;
}
