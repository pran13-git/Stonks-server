package com.neueda_project.stock_pantry.controller;

import com.neueda_project.stock_pantry.entity.Market;
import com.neueda_project.stock_pantry.service.MarketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MarketController {

    @Autowired
    MarketService marketService;

    @GetMapping("/market")
    private List<Market> getAllMarketEntries(){
        return marketService.getAllMarketEntries();
    }

    @PostMapping("/market")
    private ResponseEntity<String> saveMarketEntry(@RequestBody Market entry){
        marketService.saveOrUpdate(entry);
        return ResponseEntity.ok("Market entry added successfully.");
    }

    @DeleteMapping("/market")
    private ResponseEntity<String> deleteMarketEntry(@RequestParam Integer id){
        try{
            marketService.delete(id);
            return ResponseEntity.ok("Requested market entry deleted successfully.");
        }
        catch(Exception e){
            return ResponseEntity.status(404).body("No such entry found.");
        }
    }
}
