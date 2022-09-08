package com.rest.web.services.user;

import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Component
public class UserDaoService {

    private static List<User> users = new ArrayList<>();

    private static int usersCount = 0;

    static {
        users.add(
                new User(++usersCount, "Adam", LocalDate.now().minusYears(30)));
        users.add(
                new User(++usersCount, "Eva", LocalDate.now().minusYears(35)));
        users.add(
                new User(++usersCount, "John", LocalDate.now().minusYears(40)));
        users.add(
                new User(++usersCount, "Jim", LocalDate.now().minusYears(20)));
        users.add(
                new User(++usersCount, "Luna", LocalDate.now().minusYears(25)));
        users.add(
                new User(++usersCount, "Mark", LocalDate.now().minusYears(26)));

    }

    public List<User> findAll() {
        return users;
    }

    public User findById(int id) {
        return users.stream().filter(e -> e.getId().equals(id))
                .findFirst().orElse(null);
    }

    public User saveUser(User user) {

        user.setId(++usersCount);
        users.add(user);
        return user;
    }

}
