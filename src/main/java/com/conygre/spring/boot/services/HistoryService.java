package com.conygre.spring.boot.services;

import com.conygre.spring.boot.entities.HistoryItem;

import java.util.List;

public interface HistoryService {
    List<HistoryItem> getCompleteHistory();
    void addHistoryItem(HistoryItem item);

}


