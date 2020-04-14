package com.iamtheabdullah.socialnetworkdemo.controller;

import com.iamtheabdullah.socialnetworkdemo.dao.UserDao;
import com.iamtheabdullah.socialnetworkdemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping
//@CrossOrigin("*") -- disabled (commented out) for security reasons
@CrossOrigin("http://localhost:3000") // change port number to the one which your front-end application is on
public class UserController {
    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping(
            path = "users"
    )
    public List<UserDao> getUsers() {
        return userService.getUsers();
    }
}