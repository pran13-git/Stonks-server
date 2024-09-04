package com.neueda_project.stock_pantry.service;

import com.neueda_project.stock_pantry.entity.Stock;
import com.neueda_project.stock_pantry.repository.StockRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StockService {

    @Autowired
    private StockRepository stockRepository;

    public List<Stock> getAllStocks(){
        System.out.println(stockRepository.findAll());
//        if (symbolID != null) {
//           return stockRepository.findBySymbolID(symbolID);
//        }
//        else{
            return stockRepository.findAll();
//        }
//        if (ticker != null && companyName != null && exchange != null && industry != null) {
//            return stockRepository.findByTickerAndCompanyNameAndExchangeAndIndustry(ticker, companyName, exchange, industry);
//        } else if (ticker != null && companyName != null && industry != null) {
//            return stockRepository.findByTickerAndCompanyNameAndIndustry(ticker, companyName, industry);
//        } else if (ticker != null && exchange != null && industry != null) {
//            return stockRepository.findByTickerAndExchangeAndIndustry(ticker, exchange, industry);
//        } else if (companyName != null && exchange != null && industry != null) {
//            return stockRepository.findByCompanyNameAndExchangeAndIndustry(companyName, exchange, industry);
//        } else if (ticker != null && companyName != null) {
//            return stockRepository.findByTickerAndCompanyName(ticker, companyName);
//        } else if (ticker != null && exchange != null) {
//            return stockRepository.findByTickerAndExchange(ticker, exchange);
//        } else if (companyName != null && exchange != null) {
//            return stockRepository.findByCompanyNameAndExchange(companyName, exchange);
//        } else if (ticker != null) {
//            return stockRepository.findByTicker(ticker);
//        } else if (companyName != null) {
//            return stockRepository.findByCompanyName(companyName);
//        } else if (exchange != null) {
//            return stockRepository.findByExchange(exchange);
//        } else if (industry != null) {
//            return stockRepository.findByIndustry(industry);
//        } else {
//            return stockRepository.findAll();
//        }



    }

    public void saveOrUpdate(Stock stocks)
    {
        stockRepository.save(stocks);
    }
    //deleting a specific record by using the method deleteById() of CrudRepository
    public void delete(int id)
    {
        stockRepository.deleteById(id);
    }
    //updating a record
    public void update(Stock stocks, int stock_id)
    {
        stockRepository.save(stocks);
    }

    public Stock getStocksById(Integer id)
    {
        return stockRepository.findBySymbolID(id).get(0);
    }
}
