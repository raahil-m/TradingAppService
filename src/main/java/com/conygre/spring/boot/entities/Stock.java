// This entity class uses annotations instead of the mapping XML file

package com.conygre.spring.boot.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;



@Entity @Table(name="stocks")


public class Stock implements Serializable {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="id")
    private int id;

    // add attributes for all the remaining properties
    @Column(name="symbol") private String symbol;
    @Column(name="price") private Double price;

    @Column(name="name") private String name;

    public Stock() {}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Stock(String s, double p){
        symbol=s;
        price=p;

    }





}



