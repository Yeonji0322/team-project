package data_access;

import entity.Tutor;
import entity.User;
import use_case.profile_creation.ProfileUserDataAccessInterface;

import java.util.HashMap;
import java.util.Map;

/**
 * In-memory implementation of the DAO for storing user data. This implementation does
 * NOT persist data between runs of the program.
 * this is not done yet btw lmaoo !!!!
 */
public class InMemoryUserDataAccessObject implements ProfileUserDataAccessInterface {

    private final Map<String, Tutor> tutors = new HashMap<>();

    private String currentUsername;

    @Override
    public boolean existsByName(String identifier) {
        return tutors.containsKey(identifier);
    }

    @Override
    public void save(Tutor tutor) {
        tutors.put(tutor.getTutorName(), tutor);
    }

}