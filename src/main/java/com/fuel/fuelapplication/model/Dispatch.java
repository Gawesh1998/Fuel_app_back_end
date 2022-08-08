package com.fuel.fuelapplication.model;


import lombok.AllArgsConstructor;
import lombok.Data;

import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "dispatch")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Dispatch {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "date")
    private Date date;

    @Column(name = "name")
    private String name;

    @Column(name = "license")
    private String license;

    @Column(name = "vehicle")
    private String vehicle;

    @Column(name = "status")
    private String status;

}
