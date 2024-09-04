package com.neueda_project.stock_pantry.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.autoconfigure.web.WebProperties;

import java.time.LocalDateTime;

@Getter
@Setter
@Entity
public class Market {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private LocalDateTime date;
    private float pricePerShare;
    private float open;
    private float close;
    private float yearlyHigh;
    private float yearlyLow;
    private int volumeTraded;
    @ManyToOne
    @JoinColumn(name="stockID")
    private Stock stock;

    private Market(){
        //default constructor
    }

    public Market(LocalDateTime date, float pricePerShare, float open, float close, float yearlyHigh, float yearlyLow, int volumeTraded, Stock stock) {
        this.date = date;
        this.pricePerShare = pricePerShare;
        this.open = open;
        this.close = close;
        this.yearlyHigh = yearlyHigh;
        this.yearlyLow = yearlyLow;
        this.volumeTraded = volumeTraded;
        this.stock = stock;
    }


}
