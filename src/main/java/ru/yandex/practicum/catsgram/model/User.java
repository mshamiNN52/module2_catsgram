package ru.yandex.practicum.catsgram.model;

import jdk.jfr.DataAmount;
import lombok.Data;
import java.time.LocalDate;

@Data
public class User {

        private final Integer id;
        private final String email;
        private final String login;
        private  String name;
        private final LocalDate birthday;

        public User(Integer id, String email, String login, String name, LocalDate birthday) {
            this.id = id;
            this.email = email;
            this.login = login;
            this.name = name;
            this.birthday = birthday;
        }
}

