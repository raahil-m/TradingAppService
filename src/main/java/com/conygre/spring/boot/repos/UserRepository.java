package com.conygre.spring.boot.repos;

import com.conygre.spring.boot.entities.HistoryItem;
import com.conygre.spring.boot.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
}
