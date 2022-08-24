
package com.conygre.spring.boot.entities;
import java.io.Serializable;
import java.sql.Time;
import java.sql.Timestamp;
import javax.persistence.*;



@Entity @Table(name="history")


public class HistoryItem implements Serializable {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="id")
    private int id;

    @Column(name="symbol") private String symbol;
    @Column(name="current_price") private Double currentPrice;
    @Column(name="order_time") private Timestamp orderTime;
    @Column(name="type") private String type;

    public String getTradingPrice() {
        return tradingPrice;
    }

    public void setTradingPrice(String tradingPrice) {
        this.tradingPrice = tradingPrice;
    }

    @Column(name="trading_price") private String tradingPrice;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Timestamp getOrderTime() {
        return orderTime;
    }

    public void setOrderTime(Timestamp orderTime) {
        this.orderTime = orderTime;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Column(name="status") private String status;


    public HistoryItem() {}

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

    public Double getCurrentPrice() {
        return currentPrice;
    }

    public void setCurrentPrice(Double price) {
        this.currentPrice = price;
    }

    public HistoryItem(String s, double p, Timestamp o, String st, String t){
        symbol = s;
        currentPrice = p;
        orderTime = o;
        status = st;
        type = t;
    }





}



