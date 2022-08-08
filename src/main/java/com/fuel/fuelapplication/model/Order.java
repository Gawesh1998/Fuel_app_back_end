package com.fuel.fuelapplication.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "order1")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "license")
    private String license;

    @Column(name = "vehicle")
    private String vehicle;

    @Column(name = "fuelType")
    private String fuelType;

    @Column(name = "capacity")
    private String capacity;

}
