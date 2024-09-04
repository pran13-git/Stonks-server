package com.neueda_project.stock_pantry.controller;

import com.neueda_project.stock_pantry.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class SellController {

    @Autowired OrderService orderService;
    @PostMapping("/sell")
    public ResponseEntity<String> deleteFromPortfolio(@RequestParam int transactionId){
        orderService.delete(transactionId);
        return ResponseEntity.ok("deleted from portfolio");
    }
}
