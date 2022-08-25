package com.conygre.spring.boot.controllers;

import com.conygre.spring.boot.entities.Stock;
import com.conygre.spring.boot.entities.User;
import com.conygre.spring.boot.services.StockService;
import com.conygre.spring.boot.services.UserService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin // allows requests from all domains
@RequestMapping("/api/users")

public class UserController {
    private static Logger logger = LogManager.getLogger(UserController.class);
    @Autowired
    private UserService service;

    @RequestMapping(method = RequestMethod.GET)
    List<User> findAll() {
        logger.info("managed to call a Get request for findAll");
        return service.getAllUsers();
    }
    @RequestMapping(method=RequestMethod.PUT,  value = "/{id}",
            consumes="application/json")
    void updateDisc(@PathVariable("id") int id, @RequestBody User user) {
        service.updateUser(id, user.getBalance());
    }



}