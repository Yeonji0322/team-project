package entity;

import java.util.ArrayList;
import java.util.List;

/**
 * Factory for creating User objects (not tutors!).
 */
public class UserFactory {

    public User create(String name, String password) {
        return new User(name, password);
    }
    public Tutor createTutor(User existing, String bio, String title, ArrayList<String> subjects,
                             int price, String contact) {
        Tutor tutor = new Tutor(existing.getUsername(), existing.getPassword());
        tutor.setDescription(bio);
        tutor.setTitle(title);
        tutor.setCourses(new ArrayList<>(subjects));
        tutor.setPrice(price);
        tutor.setContact(contact);
        return tutor;
    }
}