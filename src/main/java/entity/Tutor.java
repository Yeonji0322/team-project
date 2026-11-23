package entity;

import java.util.ArrayList;

/**
 * Tutor class.
 */
public class Tutor extends User {
    public String profilename;
    public String title;
    public int price;
    public float rating;
    public ArrayList<String> courses;
    public String description;
    public String contact;

    public Tutor(String name, String password) {
        super(name, password);
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setName(String name) {
        this.profilename = name;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setRating(int rating) {
        this.rating = 0;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setCourses(ArrayList<String> courses) {
        this.courses = courses;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getTutorName() {
        return this.profilename;
    }
}
