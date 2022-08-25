package com.conygre.spring.boot.services;

import com.conygre.spring.boot.entities.Stock;
import com.conygre.spring.boot.entities.User;

import java.util.List;

public interface UserService {
    List<User> getAllUsers();

    //void addStock(Stock stock);
    void updateUser(int id, Double balance);
    //void deleteStock(int id);
}