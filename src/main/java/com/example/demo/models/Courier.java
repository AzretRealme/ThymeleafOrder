package com.example.demo.models;

import com.sun.istack.NotNull;
import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;


@Entity
@Table(name = "couriers")
@Data
public class Courier {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NotNull
    private String firstName;

    @NotNull
    private String lastName;

    @NotNull
    @ManyToOne
    @JoinColumn(name = "courier_status_id")
    private CourierStatus courierStatus;

}