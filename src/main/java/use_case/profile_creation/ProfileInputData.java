package use_case.profile_creation;

import java.util.ArrayList;

public class ProfileInputData {

    private static String name = "";
    private static int price;
    private static ArrayList<String> courses;
    private static String description;
    private static String contact;

    public ProfileInputData(String name, int price, ArrayList<String> courses, String description, String contact) {
        this.name = name;
        this.price = price;
        this.courses = courses;
        this.description = description;
        this.contact = contact;
    }

    public static String getTutorName() {
        return name;
    }

    public static int getPrice() {
        return price;
    }

    public static ArrayList<String> getCourses() {
        return courses;
    }

    public static String getDescription() {
        return description;
    }

    public static String getContact() {
        return contact;
    }
}
