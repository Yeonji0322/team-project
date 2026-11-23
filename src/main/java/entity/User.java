package entity;

import java.util.ArrayList;

/**
 * Common User class.
 */
public class User {
    private final String username;
    private String password;
    private ArrayList<Tutor> saved_tutors;
    private ArrayList<Review> reviews;

    public User(String name, String password) {
        if ("".equals(name)) {
            throw new IllegalArgumentException("Username cannot be empty");
        }
        if ("".equals(password)) {
            throw new IllegalArgumentException("Password cannot be empty");
        }
        this.username = name;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }
}
