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
    public static Tutor createTutor(User existing, String name, String bio, List<String> programs, int year, ArrayList<String> subjects,
                                    float rate, String contact) {
        Tutor tutor = new Tutor(existing.getUsername(), existing.getPassword());
        tutor.setName(name);
        tutor.setDescription(bio);
        tutor.setPrograms(programs);
        tutor.setYear(year);
        tutor.setCourses(new ArrayList<>(subjects));
        tutor.setRate(rate);
        tutor.setContact(contact);
        return tutor;
    }
}