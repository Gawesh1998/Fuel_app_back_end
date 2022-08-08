package com.fuel.fuelapplication.service;

import com.fuel.fuelapplication.model.Inventory;
import com.fuel.fuelapplication.repository.InventoryRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InventoryServiceImpl implements InventoryService{

    private final InventoryRepository inventoryRepository;

    public InventoryServiceImpl(InventoryRepository inventoryRepository) {
        this.inventoryRepository = inventoryRepository;
    }

    @Override
    public Inventory save(Inventory inventory) {

        if (inventory.getName().trim().equals(null) || inventory.getName().trim().equals(null)){
            throw new RuntimeException("Error: quantity is invalid");
        }
        return inventoryRepository.save(inventory);
    }

    @Override
    public List<Inventory> getAllInventory() {
        return inventoryRepository.findAll();
    }

    public void deductFuel(Inventory inventory){
        inventory.setDiesel(inventory.getDiesel() - inventory.getQuantity());
        inventoryRepository.save(inventory);
    }
}
