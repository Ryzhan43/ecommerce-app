package com.mryzhan.ecommerceapp.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.jdbc.support.CustomSQLErrorCodesTranslation;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Getter
@Setter
@NoArgsConstructor

public class Balance extends BaseEntity{

    private BigDecimal amount;

    @OneToOne
    private Customer customer;

}
