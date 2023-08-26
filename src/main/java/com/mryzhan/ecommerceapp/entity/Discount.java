package com.mryzhan.ecommerceapp.entity;

import com.mryzhan.ecommerceapp.enums.DiscountType;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import java.math.BigDecimal;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Discount extends BaseEntity{

    public String name;
    public BigDecimal discount;

    @Enumerated(EnumType.STRING)
    public DiscountType discountType;

}
