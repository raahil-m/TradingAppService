package com.conygre.spring.boot.repos;

import com.conygre.spring.boot.entities.HistoryItem;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HistoryRepository extends JpaRepository<HistoryItem, Integer> {

}
