package entity;

import java.util.List;

/**
 * Tutor class.
 */
public class Tutor extends User {
    public String name;
    public List<String> programs;
    public int year;
    public float rate;
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

    public void setRate(float rate) {
        this.rate = rate;
    }

    public void setRating(float rating) {
        this.rating = 0;
    }

    public void setYear(int year) {this.year = year;}

    public void setPrograms(List<String> programs) {
        this.programs = programs;
    }

    public void setCourses(List<String> courses) {this.courses = courses;}

    public void setContact(String contact) {this.contact = contact;}

    public String getTutorName() {return this.name;}

    public List<String> getCourses() { return this.courses; }

    public List<String> getPrograms() { return this.programs; }

    public float getRating() { return this.rating; }

    public int getYear() {return this.year;}

    public float getRate() { return this.rate; }


    public String getDescription() {return this.description;}

    public String getContact() {return this.contact;}
}