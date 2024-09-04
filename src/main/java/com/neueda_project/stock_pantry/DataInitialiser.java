//package com.neueda_project.stock_pantry;
//
//
//import com.neueda_project.stock_pantry.entity.Market;
//import com.neueda_project.stock_pantry.entity.Orders;
//import com.neueda_project.stock_pantry.entity.Stock;
//import com.neueda_project.stock_pantry.repository.MarketRepository;
//import com.neueda_project.stock_pantry.repository.OrderRepository;
//import com.neueda_project.stock_pantry.repository.StockRepository;
//import org.springframework.boot.CommandLineRunner;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
//import java.time.LocalDateTime;
//import java.util.Random;
//
//
//@Configuration
//public class DataInitialiser {
//    @Bean
//    @org.springframework.core.annotation.Order(1)
//    public CommandLineRunner loadStockData(StockRepository stockRepository) {
//        return new CommandLineRunner() {
//            @Override
//            public void run(String[] args) throws Exception {
//                stockRepository.save(new Stock("AAPL", "Apple Inc.", "NASDAQ", "Technology"));
//                stockRepository.save(new Stock("MSFT", "Microsoft Corp.", "NASDAQ", "Technology"));
//                stockRepository.save(new Stock("GOOGL", "Alphabet Inc.", "NASDAQ", "Technology"));
//                stockRepository.save(new Stock("AMZN", "Amazon.com Inc.", "NASDAQ", "E-commerce"));
//                stockRepository.save(new Stock("TSLA", "Tesla Inc.", "NASDAQ", "Automotive"));
//                stockRepository.save(new Stock("META", "Meta Platforms Inc.", "NASDAQ", "Technology"));
//
//                stockRepository.save(new Stock("IBM", "IBM Corp.", "NYSE", "Technology"));
//                stockRepository.save(new Stock("JPM", "JPMorgan Chase & Co.", "NYSE", "Finance"));
//                stockRepository.save(new Stock("WMT", "Walmart Inc.", "NYSE", "Retail"));
//                stockRepository.save(new Stock("DIS", "Walt Disney Co.", "NYSE", "Entertainment"));
//                stockRepository.save(new Stock("XOM", "Exxon Mobil Corp.", "NYSE", "Energy"));
//                stockRepository.save(new Stock("GE", "General Electric Co.", "NYSE", "Conglomerate"));
//
//                stockRepository.save(new Stock("TCS", "Tata Consultancy Services", "BSE", "IT"));
//                stockRepository.save(new Stock("RELIANCE", "Reliance Industries", "BSE", "Energy"));
//                stockRepository.save(new Stock("HDFCBANK", "HDFC Bank", "BSE", "Finance"));
//                stockRepository.save(new Stock("INFY", "Infosys Ltd.", "BSE", "IT"));
//                stockRepository.save(new Stock("BAJFINANCE", "Bajaj Finance", "BSE", "Finance"));
//                stockRepository.save(new Stock("HINDUNILVR", "Hindustan Unilever", "BSE", "Consumer Goods"));
//
//                stockRepository.save(new Stock("RELIANCE", "Reliance Industries", "NSE", "Energy"));
//                stockRepository.save(new Stock("TCS", "Tata Consultancy Services", "NSE", "IT"));
//                stockRepository.save(new Stock("INFY", "Infosys Ltd.", "NSE", "IT"));
//                stockRepository.save(new Stock("HDFCBANK", "HDFC Bank", "NSE", "Finance"));
//                stockRepository.save(new Stock("BAJFINANCE", "Bajaj Finance", "NSE", "Finance"));
//                stockRepository.save(new Stock("WIPRO", "Wipro Ltd.", "NSE", "IT"));
//
//                System.out.println("Initial data inserted");
//            }
//
//        };
//    }
//
//
//    @Bean
//    @org.springframework.core.annotation.Order(2)
//    public CommandLineRunner loadOrderData(OrderRepository orderRepository, StockRepository stockRepository) {
//        return new CommandLineRunner() {
//            @Override
//            public void run(String[] args) throws Exception {
//                Stock appleStock = stockRepository.findById(1).orElseThrow();
//                Stock microsoftStock = stockRepository.findById(2).orElseThrow();
//                Stock amazonStock = stockRepository.findById(4).orElseThrow();
//
//                // Hardcoded orders
//                orderRepository.save(new Orders(LocalDateTime.of(2024, 8, 1, 10, 0), 10, 150.0f, appleStock));
//                orderRepository.save(new Orders(LocalDateTime.of(2024, 8, 2, 11, 30), 5, 200.0f, microsoftStock));
//                orderRepository.save(new Orders(LocalDateTime.of(2024, 8, 3, 14, 45), 7, 250.0f, amazonStock));
//
//                System.out.println("Initial orders inserted");
//
//            }
//
//        };
//    }
//
//    @Bean
//    @org.springframework.core.annotation.Order(3)
//    public CommandLineRunner loadMarketData(MarketRepository marketRepository, StockRepository stockRepository) {
//        return new CommandLineRunner() {
//            @Override
//            public void run(String[] args) throws Exception {
//                for (int stockId = 1; stockId <= 24; stockId++) {
//                    Stock stock = stockRepository.findById(stockId).orElse(null);
//
//                    if (stock != null) {
//                        LocalDateTime date = LocalDateTime.now().minusDays(new Random().nextInt(30));
//                        float pricePerShare = 100 + new Random().nextFloat() * 1000;
//                        float open = pricePerShare - new Random().nextFloat() * 50;
//                        float close = pricePerShare + new Random().nextFloat() * 50;
//                        float yearlyHigh = pricePerShare + new Random().nextFloat() * 200;
//                        float yearlyLow = pricePerShare - new Random().nextFloat() * 200;
//                        int volumeTraded = 1000 + new Random().nextInt(10000);
//
//                        Market market = new Market(date, pricePerShare, open, close, yearlyHigh, yearlyLow, volumeTraded, stock);
//                        marketRepository.save(market);
//                    }
//                }
//
//                System.out.println("Initial market data inserted");
//
//            }
//
//        };
//    }
//}

