package com.conygre.spring.boot.services;

import com.conygre.spring.boot.entities.Stock;
import com.conygre.spring.boot.entities.User;
import com.conygre.spring.boot.repos.StockRepository;
import com.conygre.spring.boot.repos.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class UserServicelmpl implements UserService{
    @Autowired
    private UserRepository dao;
    @Override
    public String getUserName(int user_id) {

        User user = dao.findById(user_id).get();
        return user.getUsername();
    }

    @Override
    public Double getBalance(int user_id) {
        User user = dao.findById(user_id).get();
        return user.getBalance();
    }
}
