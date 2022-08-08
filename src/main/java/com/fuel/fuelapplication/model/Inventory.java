package com.fuel.fuelapplication.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "inventory")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Inventory {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "petrol")
    private int petrol;

    @Column(name = "diesel")
    private int diesel;

    @Column(name = "quantity")
    private int quantity;

}
