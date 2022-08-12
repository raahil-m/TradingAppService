package com.conygre.spring.boot.services;

import com.conygre.spring.boot.entities.HistoryItem;
import com.conygre.spring.boot.repos.HistoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;

@Service
@Transactional
public class HistoryServiceImpl implements HistoryService {
    @Autowired
    HistoryRepository dao;
    @Override
    public List<HistoryItem> getCompleteHistory() {
        return dao.findAll();
    }

    @Override
    public void addHistoryItem(HistoryItem item) {
        dao.save(item);

    }
}
