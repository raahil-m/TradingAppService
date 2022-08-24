
package com.conygre.spring.boot.entities;

import javax.persistence.*;
import java.io.Serializable;
@Entity
@Table(name="user")
public class User implements Serializable {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="user_id")
    private int user_id;

    // add attributes for all the remaining properties of the user
    @Column(name="username") private String username;
    @Column(name="balance") private Double balance;



    public User() {

    }

    public User(String username, double balance){
        this.balance = balance;
        this.username = username;

    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }
}

