package com.fuel.fuelapplication.controller;

import com.fuel.fuelapplication.model.Inventory;
import com.fuel.fuelapplication.service.InventoryService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/inventory")
@AllArgsConstructor
public class InventoryController {

    private final InventoryService inventoryService;

    @PostMapping("/add")
    public ResponseEntity<Inventory> save(@RequestBody Inventory inventory){
        return new ResponseEntity<>(inventoryService.save(inventory), HttpStatus.CREATED);
    }

    @GetMapping("/list")
    public List<Inventory> getAllInventory(){
        return inventoryService.getAllInventory();
    }
}
