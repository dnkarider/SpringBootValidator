package com.example.Example;

import java.util.ArrayList;
import java.util.List;

public class UserRepository {
    private final String USER = "test";
    private final String PASSWORD = "1234";

    List<Authorities> roots = new ArrayList<>();

    public List<Authorities> getUserAuthorities(String user, String password) {
        if (user.equals(USER) && password.equals(PASSWORD)) {
            roots.add(Authorities.DELETE);
            roots.add(Authorities.READ);
            roots.add(Authorities.WRITE);
        }
        return roots;
    }
}
