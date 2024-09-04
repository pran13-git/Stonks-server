package com.neueda_project.stock_pantry.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Set;

@Setter
@Getter
@Entity
@Table(name = "Symboldata")
public class Stock {

    @Id
    @Column(name = "symbolid")
    private Integer symbolID ;

    private String symbol;

    @Column(name = "companyname")
    private String companyName;

//    @OneToMany(mappedBy = "stock", cascade = CascadeType.ALL, orphanRemoval = true)
//    private Set<Orders> orders;

    public Stock() {
        // Default constructor
    }

    @Override
    public String toString() {
        return "Stock{" +
                "symbolID=" + symbolID +
                ", symbol='" + symbol + '\'' +
                ", companyName='" + companyName + '\'' +
                '}';
    }

    public Stock(Integer symbolID, String symbol, String companyName) {
        this.symbolID = symbolID;
        this.symbol = symbol;
        this.companyName = companyName;
    }



}
