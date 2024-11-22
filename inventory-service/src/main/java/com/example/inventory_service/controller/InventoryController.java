package com.example.inventory_service.controller;

import com.example.inventory_service.repositories.InventoryRepository;
import com.example.inventory_service.service.InventoryService;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/inventory")
public class InventoryController {

    private final InventoryService inventoryService;

    @GetMapping("/{sku-code}")
    @ResponseStatus(HttpStatus.OK)
    public boolean isInStock(@PathVariable("sku-code")String skuCode){
        return inventoryService.isInStock(skuCode);
    }
}