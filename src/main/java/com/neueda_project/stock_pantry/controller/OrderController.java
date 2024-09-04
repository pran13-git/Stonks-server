package com.neueda_project.stock_pantry.controller;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.neueda_project.stock_pantry.entity.Orders;
import com.neueda_project.stock_pantry.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.sql.SQLOutput;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@RestController
public class OrderController {

    @Autowired
    OrderService orderService;

    @GetMapping("/portfolio")
    private List<Orders> getAllPortfolio(){
        return orderService.getAllOrders();
    }

//    @PostMapping("/portfolio")
//    private ResponseEntity<String> saveOrder(@RequestBody Orders orderObj){
//        System.out.println("Post request being handled");
//        System.out.println("Received Orders object: " + orderObj);
//
//        System.out.println("Company ID: " + orderObj.getCompanyId());
//        System.out.println("Company Symbol: " + orderObj.getCompanySymbol());
//        System.out.println("High: " + orderObj.getHigh());
//        System.out.println("Low: " + orderObj.getLow());
//        System.out.println("Market Open: " + orderObj.getMarketOpen());
//        System.out.println("Market Close: " + orderObj.getMarketClose());
//        System.out.println("Avg Price: " + orderObj.getAvgPrice());
//        if (orderObj.getCompanyId() == null) {
//            return ResponseEntity.badRequest().body("Company ID must not be null");
//        }
//
//        try {
//            orderService.saveOrUpdate(orderObj);
//            return ResponseEntity.ok("Order created successfully");
//        } catch (Exception e) {
//            System.out.println("exception");
//            e.printStackTrace(); // Log the stack trace for debugging
//            return ResponseEntity.status(500).body("An error occurred while processing the order");
//        }
//    }

    @PostMapping("/portfolio")
    private ResponseEntity<String> saveOrder(@RequestBody JsonNode jsonNode) {
        System.out.println("Post request being handled");

        // Initialize ObjectMapper to parse the JSON
        ObjectMapper objectMapper = new ObjectMapper();

        try {
            // Validate and extract fields
            if (!jsonNode.has("companyID") || !jsonNode.has("companySymbol") ||
                    !jsonNode.has("High") || !jsonNode.has("Low") ||
                    !jsonNode.has("MarketOpen") || !jsonNode.has("MarketClose") ||
                    !jsonNode.has("AvgPrice")) {

                return ResponseEntity.badRequest().body("Missing required fields");
            }

            // Extract fields
            Integer companyId = jsonNode.get("companyID").asInt();
            String companySymbol = jsonNode.get("companySymbol").asText();
            double high = jsonNode.get("High").asDouble();
            double low = jsonNode.get("Low").asDouble();
            double marketOpen = jsonNode.get("MarketOpen").asDouble();
            double marketClose = jsonNode.get("MarketClose").asDouble();
            double avgPrice = jsonNode.get("AvgPrice").asDouble();
            LocalDateTime dop =  LocalDateTime.now();  // current date time

            Orders order = new Orders(
                    companyId,
                    companySymbol,
                    0, // volume is yet to be implemented in frontend
                    avgPrice,
                    dop,
                    high,
                    low,
                    marketOpen,
                    marketClose
            );


            System.out.println("Received Orders object: " + order);

            orderService.saveOrUpdate(order);

            return ResponseEntity.ok("Order created successfully");

        } catch (Exception e) {
            System.out.println("exception");
            e.printStackTrace(); //
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("An error occurred while processing the order");
        }
    }

    @DeleteMapping("/portfolio")
    private ResponseEntity<String> deleteOrder(@RequestParam Integer id){
        try{
            orderService.delete(id);
            return ResponseEntity.ok("Deleted order");
        }
        catch(Exception e){
            return ResponseEntity.status(404).body("order not found in portfolio");
        }

    }
}
