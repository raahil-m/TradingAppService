package com.conygre.spring.boot.controllers;

import com.conygre.spring.boot.entities.HistoryItem;
import com.conygre.spring.boot.entities.Stock;
import com.conygre.spring.boot.services.HistoryService;
import com.conygre.spring.boot.services.StockService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

@RestController
@CrossOrigin // allows requests from all domains
@RequestMapping("/api/history")
public class HistoryController {

    private static Logger logger = LogManager.getLogger(StockController.class);
    @Autowired
    private HistoryService service;

    @RequestMapping(method = RequestMethod.GET)
    List<HistoryItem> findAll() {
        logger.info("GET: Complete History");
        return service.getCompleteHistory();
    }

    @RequestMapping(method=RequestMethod.POST,
            consumes="application/json")
    void addHistoryItem(@RequestBody HistoryItem item) {
        logger.info("POST: New history item");
        Date date = new Date();
        item.setOrderTime(new Timestamp(date.getTime()));
        service.addHistoryItem(item);
    }


}