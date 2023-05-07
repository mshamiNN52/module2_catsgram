package ru.yandex.practicum.catsgram.service;

import org.springframework.stereotype.Service;
import ru.yandex.practicum.catsgram.model.Post;
import ru.yandex.practicum.catsgram.model.User;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {

    private final List<User> users = new ArrayList<>();

    public List<User> findAll() {
        return users;
    }

    public User create(User user) {
        users.add(user);
        return user;
    }

    public User findUserEmail(String str) {
        for (User user : users) {
            if (str.equals(user.getEmail())) {
                return user;
            }
        }
        return null;
    }
}

