package com.fuel.fuelapplication.repository;

import com.fuel.fuelapplication.model.Inventory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InventoryRepository extends JpaRepository<Inventory, Long> {
}
