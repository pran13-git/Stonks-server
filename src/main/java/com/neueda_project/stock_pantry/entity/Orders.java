package com.neueda_project.stock_pantry.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Getter
@Setter
@Entity
public class Orders {

    @Id
    @Column(name = "Companyid")
    private Integer companyId;

    @Column(name = "Companysymbol", length = 20)
    private String companySymbol;

    @Column(name = "Volume")
    private int volume;

    @Column(name = "Avgprice")
    private double avgPrice;

    @Column(name = "DOP")
    private LocalDateTime dop;

    @Column(name = "High")
    private double high;

    @Column(name = "Low")
    private double low;

    @Column(name = "Marketopen")
    private double marketOpen;

    @Column(name = "Marketclose")
    private double marketClose;

    public Orders() {
        // Default constructor
    }

    public Orders(Integer companyId, String companySymbol, int volume, double avgPrice, LocalDateTime dop,
                  double high, double low, double marketOpen, double marketClose) {
        this.companyId = companyId;
        this.companySymbol = companySymbol;
        this.volume = volume;
        this.avgPrice = avgPrice;
        this.dop = dop;
        this.high = high;
        this.low = low;
        this.marketOpen = marketOpen;
        this.marketClose = marketClose;
    }

    @Override
    public String toString() {
        return "Orders{" +
                "companyId=" + companyId +
                ", companySymbol='" + companySymbol + '\'' +
                ", volume=" + volume +
                ", avgPrice=" + avgPrice +
                ", dop=" + dop +
                ", high=" + high +
                ", low=" + low +
                ", marketOpen=" + marketOpen +
                ", marketClose=" + marketClose +
                '}';
    }
}
