package com.neueda_project.stock_pantry.repository;

import com.neueda_project.stock_pantry.entity.Stock;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface StockRepository extends JpaRepository<Stock, Integer> {

    List<Stock> findBySymbolID(Integer SymbolID);
//
//    List<Stock> findByCompanyName(String companyName);
//
//    List<Stock> findByExchange(String exchange);
//
//    List<Stock> findByIndustry(String industry);
//
//    List<Stock> findByTickerAndCompanyName(String ticker, String companyName);
//
//    List<Stock> findByTickerAndExchange(String ticker, String exchange);
//
//    List<Stock> findByCompanyNameAndExchange(String companyName, String exchange);
//
//    List<Stock> findByTickerAndCompanyNameAndExchange(String ticker, String companyName, String exchange);
//
//    List<Stock> findByTickerAndCompanyNameAndExchangeAndIndustry(String ticker, String companyName, String exchange, String industry);
//
//    List<Stock> findByTickerAndCompanyNameAndIndustry(String ticker, String companyName, String industry);
//
//    List<Stock> findByTickerAndExchangeAndIndustry(String ticker, String exchange, String industry);
//
//    List<Stock> findByCompanyNameAndExchangeAndIndustry(String companyName, String exchange, String industry);

}
