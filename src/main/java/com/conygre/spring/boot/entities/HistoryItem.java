
package com.conygre.spring.boot.entities;
import java.io.Serializable;
import javax.persistence.*;



@Entity @Table(name="history")


public class HistoryItem implements Serializable {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="id")
    private int id;

    @Column(name="symbol") private String symbol;
    @Column(name="current_price") private Double price;
    @Column(name="quantity") private Integer quantity;

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

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

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public HistoryItem(String s, double p, Integer q){
        symbol = s;
        price = p;
        quantity = q;
    }





}



