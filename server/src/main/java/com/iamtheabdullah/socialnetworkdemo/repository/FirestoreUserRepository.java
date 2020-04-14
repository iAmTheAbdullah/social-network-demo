package com.iamtheabdullah.socialnetworkdemo.repository;

import com.iamtheabdullah.socialnetworkdemo.dao.UserDao;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository("Firebase")
public class FirestoreUserRepository implements UserRepositoryInterface {


    @Override
    public UserDao getUser(UUID userID) {
        return null;
    }

    @Override
    public List<UserDao> getAllUsers() {
        return null;
    }
}
