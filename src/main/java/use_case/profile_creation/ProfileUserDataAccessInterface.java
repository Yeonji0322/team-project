package use_case.profile_creation;
import entity.Tutor;

/**
 * DAO interface for the Signup Use Case.
 */
public interface ProfileUserDataAccessInterface {

    /**
     * Checks if the given username exists.
     * @param name the username to look for - tutors have names, NOT usernames!
     * @return true if a user with the given username exists; false otherwise
     */
    boolean existsByName(String name);

    /**
     * Saves the user.
     * @param tutor the user to save
     */
    void save(Tutor tutor);
}