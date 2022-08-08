package com.fuel.fuelapplication.dto;

public class InventoryDto {

    private Long id;
    private String name;
    private int petrol;
    private int diesel;
    private int quantity;


    public InventoryDto(Long id, String name, int petrol, int diesel, int quantity) {
        this.id = id;
        this.name = name;
        this.petrol = petrol;
        this.diesel = diesel;
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

    public int getPetrol() {
        return petrol;
    }

    public void setPetrol(int petrol) {
        this.petrol = petrol;
    }

    public int getDiesel() {
        return diesel;
    }

    public void setDiesel(int diesel) {
        this.diesel = diesel;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
