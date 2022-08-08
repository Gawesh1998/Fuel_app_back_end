package com.fuel.fuelapplication.dto;

public class OrederDto {

    private Long id;
    private String name;
    private String license;
    private String vehicle;
    private String fuelType;
    private String capacity;

    public OrederDto(Long id, String name, String license, String vehicle, String fuelType, String capacity) {
        this.id = id;
        this.name = name;
        this.license = license;
        this.vehicle = vehicle;
        this.fuelType = fuelType;
        this.capacity = capacity;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public String getCapacity() {
        return capacity;
    }

    public void setCapacity(String capacity) {
        this.capacity = capacity;
    }
}
