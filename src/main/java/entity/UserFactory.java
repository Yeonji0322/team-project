package entity;

import java.util.ArrayList;
import java.util.List;

/**
 * Factory for creating User objects (not tutors!).
 */
public class UserFactory {

    public static User create(String name, String password) {
        return new User(name, password);
    }
    public static Tutor createTutor(User existing, String name, String bio, String program, int year, ArrayList<String> subjects,
                                    int price, String contact) {
        Tutor tutor = new Tutor(existing.getUsername(), existing.getPassword());
        tutor.setName(name);
        tutor.setDescription(bio);
        tutor.setProgram(program);
        tutor.setYear(year);
        tutor.setCourses(new ArrayList<>(subjects));
        tutor.setPrice(price);
        tutor.setContact(contact);
        return tutor;
    }
}