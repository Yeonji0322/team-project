package entity;

import java.util.ArrayList;
import java.util.List;

/**
 * Tutor class.
 */
public class Tutor extends User {
    public String name;
    public String program;
    public int year;
    public int rate;
    public float rating;
    public List<String> courses;
    public String description;
    public String contact;

    public Tutor(String name, String password) {
        super(name, password);
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(int price) {
        this.rate = price;
    }

    public void setRating(int rating) {
        this.rating = 0;
    }

    public void setYear(int year) {this.year = year;}

    public void setProgram(String program) {
        this.program = program;
    }

    public void setCourses(List<String> courses) {this.courses = courses;}

    public void setContact(String contact) {this.contact = contact;}

    public String getTutorName() {return this.name;}

    public List<String> getCourses() { return this.courses; }

    public String getProgram() { return this.program; }

    public int getYear() {return this.year;}

    public int getPrice() { return this.rate; }


    public String getDescription() {return this.description;}

    public String getContact() {return this.contact;}
}
