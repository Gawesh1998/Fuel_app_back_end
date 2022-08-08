package com.fuel.fuelapplication.dto;

import java.util.Date;

public class DispatchDto {
    private int id;
    private Date date;
    private String name;
    private String license;
    private String vehicle;
    private String status;

    public DispatchDto(int id, Date date, String name, String license, String vehicle, String status) {
        this.id = id;
        this.date = date;
        this.name = name;
        this.license = license;
        this.vehicle = vehicle;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLicense() {
        return license;
    }

    public void setLicense(String license) {
        this.license = license;
    }

    public String getVehicle() {
        return vehicle;
    }

    public void setVehicle(String vehicle) {
        this.vehicle = vehicle;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
