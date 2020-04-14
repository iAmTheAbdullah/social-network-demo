package com.iamtheabdullah.socialnetworkdemo.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class UserDao {
    private UUID userID;
    private String username;
    private String emailAddress;
    private List<UserDao> following;
//    private List<UserDao> followers;

    public UserDao(UUID userID, String username, String emailAddress) {
        this.userID = userID;
        this.username = username;
        this.emailAddress = emailAddress;

        following = new ArrayList<>();
    }

    public UUID getUserID() {
        return userID;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }
}