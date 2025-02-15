package ru.yandex.practicum.catsgram.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.yandex.practicum.catsgram.exeption.UserNotFoundException;
import ru.yandex.practicum.catsgram.model.Post;
import java.util.ArrayList;
import java.util.List;

@Service
public class PostService {
    private final UserService userService;
    private final List<Post> posts = new ArrayList<>();

    @Autowired
    public PostService(UserService userService) {
        this.userService = userService;
    }
    public List<Post> findAll() {
        return posts;
    }

    public Post create(Post post) throws UserNotFoundException {
        if(userService.findUserEmail(post.getAuthor().getEmail()) != null) {
            posts.add(post);
        } else {
            throw new UserNotFoundException("Пользователь" + post.getAuthor().getEmail() + "не найден");
        }
        return post;
    }
}
