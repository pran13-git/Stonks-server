package com.neueda_project.stock_pantry.service;

import com.neueda_project.stock_pantry.entity.Market;
import com.neueda_project.stock_pantry.entity.Orders;
import com.neueda_project.stock_pantry.repository.MarketRepository;
import com.neueda_project.stock_pantry.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
public class PerformanceService {

    @Autowired
    OrderRepository orderRepository;
    @Autowired
    MarketRepository marketRepository;

    float currAmt, invAmt;
    public Float getInvestedAmt(){
        currAmt=invAmt=0;
        List<Orders> orders = orderRepository.findAll();

        for (Orders x:orders ){
            invAmt+= (float) (x.getVolume()*x.getAvgPrice());
        }
        return (Float)(invAmt);
    }

//    public Float getCurrentAmt(){
//        currAmt=invAmt=0;
//
//        List<Orders> orders = orderRepository.findAll();
//        List<Market> marketList = marketRepository.findAll();
//
//        for (Orders x:orders ){
//
//            for(Market m: marketList)
//            {
//                if (Objects.equals(x.getStock().getStockId(), m.getStock().getStockId())){
//                    currAmt+=m.getPricePerShare();
//                }
//            }
//        }
//        return (Float)(currAmt);
//    }

//    public Float getPercentage(){
//        currAmt=invAmt=0;
//
//        List<Orders> orders = orderRepository.findAll();
//        List<Market> marketList = marketRepository.findAll();
//
//        for (Orders x:orders ){
//            invAmt+=x.getQty()*x.getPricePerShareWhenPurchased();
//            for(Market m: marketList)
//            {
//                if (Objects.equals(x.getStock().getStockId(), m.getStock().getStockId())){
//                    currAmt+=m.getPricePerShare();
//                }
//            }
//        }
//
//        return ((currAmt-invAmt)*100/invAmt);
//
//    }
//
//    public Float getProfitOrLoss(){
//        currAmt=invAmt=0;
//
//        List<Orders> orders = orderRepository.findAll();
//        List<Market> marketList = marketRepository.findAll();
//
//        for (Orders x:orders ){
//            invAmt+=x.getQty()*x.getPricePerShareWhenPurchased();
//            for(Market m: marketList)
//            {
//                if (Objects.equals(x.getStock().getStockId(), m.getStock().getStockId())){
//                    currAmt+=m.getPricePerShare();
//                }
//            }
//        }
//
//        return (currAmt-invAmt);
//
//    }
//
//    public Float getProfitOrLoss(Orders x){
//        currAmt=invAmt=0;
//
//        List<Market> marketList = marketRepository.findAll();
//
//        invAmt+=x.getQty()*x.getPricePerShareWhenPurchased();
//        for(Market m: marketList)
//        {
//            if (Objects.equals(x.getStock().getStockId(), m.getStock().getStockId())){
//                currAmt=m.getPricePerShare();
//            }
//        }
//
//
//        return (currAmt-invAmt);
//
//    }
//
//    public Float getPercentage(Orders x){
//        currAmt=invAmt=0;
//
//        List<Market> marketList = marketRepository.findAll();
//
//        invAmt+=x.getQty()*x.getPricePerShareWhenPurchased();
//        for(Market m: marketList)
//        {
//            if (Objects.equals(x.getStock().getStockId(), m.getStock().getStockId())){
//                currAmt=m.getPricePerShare();
//            }
//        }
//        return ((currAmt-invAmt)*100/invAmt);
//
//    }
}
