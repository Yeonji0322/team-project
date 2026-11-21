package entity;

import java.util.ArrayList;

/**
 * Tutor class.
 */
public class Tutor extends User {
    public String title;
    public int price;
    public ArrayList<String> courses;
    public String description;
    public String contact;
    public ArrayList<Review> reviews;

    public Tutor(String name, String password) {
        super(name, password);
    }
}
