package com.example.demo.models;

import lombok.Data;
import org.springframework.data.annotation.Id;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "orders_status")
@Data
public class OrderStatus {

    @Id
    private Long id;

    private String name;
}