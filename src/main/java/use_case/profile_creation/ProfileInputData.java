package use_case.profile_creation;

import java.util.ArrayList;

public class ProfileInputData {

    private final String name;
    private final int price;
    private final ArrayList<String> courses;
    private final String description;
    private final String contact;

    public ProfileInputData(String name, int price, ArrayList<String> courses, String description, String contact) {
        this.name = name;
        this.price = price;
        this.courses = courses;
        this.description = description;
        this.contact = contact;
    }

    public String getTutorName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public ArrayList<String> getCourses() {
        return courses;
    }

    public String getDescription() {
        return description;
    }

    public String getContact() {
        return contact;
    }
}
