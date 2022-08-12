package com.conygre.spring.boot.controllers;

import com.conygre.spring.boot.entities.Stock;
import com.conygre.spring.boot.services.StockService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin // allows requests from all domains
@RequestMapping("/api/stocks")
public class StockController {

    private static Logger logger = LogManager.getLogger(StockController.class);
    @Autowired
    private StockService service;

    @RequestMapping(method = RequestMethod.GET)
    List<Stock> findAll() {
        logger.info("managed to call a Get request for findAll");
        return service.getAllStocks();
    }

    @RequestMapping(method=RequestMethod.POST,
            consumes="application/json")
    void addStock(@RequestBody Stock stock) {
        service.addStock(stock);
    }
    @RequestMapping(method=RequestMethod.PUT,  value = "/{id}",
            consumes="application/json")
    void updateStock(@PathVariable("id") int id, @RequestBody Stock stock) {
         service.updateStock(id, stock);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/{id}")
    public void deleteStock(@PathVariable("id") int id) {
        service.deleteStock(id);
    }

    @RequestMapping(value="/with404/{id}", method=RequestMethod.GET)
    public ResponseEntity<Stock> getStockByIdHandling404(@PathVariable("id") int id) {
        Stock stockToReturn = service.getAllStocks().get(id);

        if (stockToReturn ==null) {
            return new ResponseEntity<Stock>(HttpStatus.NOT_FOUND);
        }
        else {
            return new ResponseEntity<Stock>(stockToReturn, HttpStatus.OK);
        }
    }

}