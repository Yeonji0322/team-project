package entity;

/**
 * Factory for creating User objects (not tutors!).
 */
public class UserFactory {

    public User create(String name, String password) {
        return new User(name, password);
    }
}