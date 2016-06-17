package dev.polesskiy.service;

import dev.polesskiy.dao.UserDao;
import dev.polesskiy.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {
//    @Autowired
//    private UserDao userDao;

    public void add(User user) {
        System.out.printf("Creating user %s", user);
    }

    public void remove(String login) {
        System.out.printf("Deleting user with login: %s", login);
    }

    public List<User> getAll() {
        System.out.printf("Get all users from DB");
        return new ArrayList<>();
    }
}
