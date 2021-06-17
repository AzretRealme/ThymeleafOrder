package com.example.demo.models;


import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "addresses")
@Data
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String phone;

    @ManyToOne(cascade = CascadeType.ALL)
    private Order order;

}