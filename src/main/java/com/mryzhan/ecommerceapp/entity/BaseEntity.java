package com.mryzhan.ecommerceapp.entity;

import javax.persistence.*;

@MappedSuperclass
@Entity
public class BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long id;

}