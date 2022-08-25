
package com.conygre.spring.boot.services;

import com.conygre.spring.boot.entities.Stock;
import com.conygre.spring.boot.entities.User;
import com.conygre.spring.boot.repos.StockRepository;
import com.conygre.spring.boot.repos.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Service
@Transactional

public class UserServiceImpl implements UserService{
    @Autowired
    private UserRepository dao;

    public List<User> getAllUsers() {

        return dao.findAll();
    }
}
