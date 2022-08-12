package com.conygre.spring.boot.services;

import com.conygre.spring.boot.entities.Stock;
import com.conygre.spring.boot.repos.StockRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class StockServiceImpl implements StockService {

    @Autowired
    private StockRepository dao;


    public List<Stock> getAllStocks() {
        return dao.findAll();
    }

    @Override
    public void addStock(Stock stock) {
        dao.save(stock);
    }

    @Override
    public void updateStock(int id, Stock stock) {
       Stock currStock = dao.findById(id).get();

        dao.save(currStock);
    }

    @Override
    public void deleteStock(int id) {
        Stock stock = dao.findById(id).get();
        dao.delete(stock);
    }
}
