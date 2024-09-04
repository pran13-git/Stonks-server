//package com.neueda_project.stock_pantry.service;
//
//import com.neueda_project.stock_pantry.entity.Orders;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import java.util.List;
//import java.util.Objects;
//
//@Service
//public class FilterService {
//
//    @Autowired
//    OrderService orderService;
//
//    List<Orders> orders = orderService.getAllOrders();
//
//
//
//    // check this
//    public List<Orders> filterByIndustry(String industry){
//        List<Orders> filtered_orders = new java.util.ArrayList<>();
//        for (Orders x:orders){
//            if(Objects.equals(x.getStock().getIndustry(), industry)){
//                filtered_orders.add(x);
//            }
//        }
//        return filtered_orders;
//    }
//
//
//}
