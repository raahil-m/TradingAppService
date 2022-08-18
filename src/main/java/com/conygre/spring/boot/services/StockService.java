package com.conygre.spring.boot.services;

import com.conygre.spring.boot.entities.Stock;

import java.util.List;

public interface StockService {
    List<Stock> getAllStocks();
    void addStock(Stock stock);
    void updateStock(int id, Stock stock);
    void deleteStock(int id);

}


