package com.neueda_project.stock_pantry.controller;

import com.neueda_project.stock_pantry.service.PerformanceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PerformanceController {

    @Autowired
    PerformanceService performanceService;

//    @GetMapping("/performance/percentage")
//    private Float getPercentage() {
//        return performanceService.getPercentage();
//    }
//
//    @GetMapping("/performance/currentAmount")
//    private Float getCurrentAmt() {
//        return performanceService.getCurrentAmt();
//    }

    @GetMapping("/performance/investedAmount")
    private Float getInvestedAmt() {
        return performanceService.getInvestedAmt();
    }

//    @GetMapping("/performance/profitOrLoss")
//    private Float getProfitOrLoss() {
//        return performanceService.getProfitOrLoss();
//    }



}
