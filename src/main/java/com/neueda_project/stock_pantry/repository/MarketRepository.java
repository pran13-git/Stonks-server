package com.neueda_project.stock_pantry.repository;

import com.neueda_project.stock_pantry.entity.Market;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MarketRepository extends JpaRepository<Market, Integer> {
}
