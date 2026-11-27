package use_case.profile_creation;

import java.util.ArrayList;
import java.util.List;

public class ProfileInputData {

    private String name = "";
    private final int price;
    private final int year;
    private final String program;
    private final ArrayList<String> courses;
    private final String description;
    private final String contact;

    public ProfileInputData(String name, int price, String program, int year, ArrayList<String> courses, String description, String contact) {
        this.name = name;
        this.price = price;
        this.year = year;
        this.program = program;
        this.courses = courses;
        this.description = description;
        this.contact = contact;
    }

    public static String getTutorName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public int getYear() {
        return year;
    }

    public String getProgram() {
        return program;
    }

    public List<String> getCourses() {
        return courses;
    }

    public String getDescription() {
        return description;
    }

    public String getContact() {
        return contact;
    }
}
