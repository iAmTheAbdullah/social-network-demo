package com.iamtheabdullah.socialnetworkdemo.service;

import com.iamtheabdullah.socialnetworkdemo.dao.UserDao;
import com.iamtheabdullah.socialnetworkdemo.repository.UserRepositoryInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    private final UserRepositoryInterface userRepository;

    @Autowired
    public UserService(@Qualifier("fake") UserRepositoryInterface userRepository) {
        this.userRepository = userRepository;
    }

    public List<UserDao> getUsers() {
        return userRepository.getAllUsers();
    }
}