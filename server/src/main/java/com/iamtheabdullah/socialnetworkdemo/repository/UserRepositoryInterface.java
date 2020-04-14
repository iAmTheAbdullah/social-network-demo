package com.iamtheabdullah.socialnetworkdemo.repository;

import com.iamtheabdullah.socialnetworkdemo.dao.UserDao;

import java.util.List;
import java.util.UUID;

public interface UserRepositoryInterface {
    UserDao getUser(UUID userID);
    List<UserDao> getAllUsers();
}