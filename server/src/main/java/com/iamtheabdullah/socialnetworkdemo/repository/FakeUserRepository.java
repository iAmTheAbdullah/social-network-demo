package com.iamtheabdullah.socialnetworkdemo.repository;

import com.iamtheabdullah.socialnetworkdemo.dao.UserDao;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Repository("fake")
public class FakeUserRepository implements UserRepositoryInterface {
    private static final List<UserDao> USER_DB = new ArrayList<>();

    static {
        USER_DB.add(new UserDao(
                UUID.randomUUID(),
                "admin.admin",
                "admin@admin.com"
        ));
        USER_DB.add(new UserDao(
                UUID.randomUUID(),
                "john.doe",
                "john.doe@gmail.com"
        ));
        USER_DB.add(new UserDao(
                UUID.randomUUID(),
                "jane.doe",
                "jane.doe@gmail.com"
        ));
    }

    @Override
    public UserDao getUser(UUID userID) {
        return USER_DB.stream()
                .filter(user -> user.getUserID().equals(userID))
                .findFirst()
                .get();
    }

    @Override
    public List<UserDao> getAllUsers() {
        return USER_DB;
    }
}