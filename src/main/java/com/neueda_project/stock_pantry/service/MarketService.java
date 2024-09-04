package com.neueda_project.stock_pantry.service;

import com.neueda_project.stock_pantry.entity.Market;
import com.neueda_project.stock_pantry.entity.Orders;
import com.neueda_project.stock_pantry.repository.MarketRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MarketService {

    @Autowired
    MarketRepository marketRepository;

    public List<Market> getAllMarketEntries(){
        return marketRepository.findAll();
    }

    public void saveOrUpdate(Market entry)
    {
        marketRepository.save(entry);
    }
    //deleting a specific record by using the method deleteById() of CrudRepository
    public void delete(int id)
    {
        marketRepository.deleteById(id);
    }
}
