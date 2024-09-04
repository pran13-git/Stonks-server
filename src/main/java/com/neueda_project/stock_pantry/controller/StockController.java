package com.neueda_project.stock_pantry.controller;

import com.neueda_project.stock_pantry.entity.Stock;
import com.neueda_project.stock_pantry.service.StockService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
//@RequestMapping("/stock")
public class StockController {
    private static final Logger log = LoggerFactory.getLogger(StockController.class);
    @Autowired
    private StockService stockService;

    @GetMapping("/stock")
//    private List<Stock> getAllStocks(@RequestParam(required = false) String symbolID,
//                                     @RequestParam(required = false) String companyName,
//                                     @RequestParam(required = false) String symbol
//                                     ){
    private List<Stock> getAllStocks(){
        return stockService.getAllStocks();
    }

    @PostMapping("/stock")
    private ResponseEntity<String> saveStock(@RequestBody Stock stock)
    {
        System.out.println("Post req being handled");
        stockService.saveOrUpdate(stock);
//        return stock.getStock_id();
        return ResponseEntity.ok("Stock created successfully");
    }

    @DeleteMapping("/stock")
    private ResponseEntity<String> deleteStock(@RequestParam Integer id){
        try{
            stockService.delete(id);
            return ResponseEntity.ok("Deleted stock");
        }
        catch(Exception e){
            return ResponseEntity.status(404).body("stock not found");
        }

    }

    @GetMapping("/stockById")
    private Stock getStockById (@RequestParam Integer id){
        try{
            return stockService.getStocksById(id);
        }
        catch(Exception e){
            System.out.println(e);
            return new Stock();
        }
    }


}
