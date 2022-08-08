package com.fuel.fuelapplication.service;

import com.fuel.fuelapplication.model.Inventory;

import java.util.List;

public interface InventoryService {

    Inventory save (Inventory inventory);
    List<Inventory> getAllInventory();
}
