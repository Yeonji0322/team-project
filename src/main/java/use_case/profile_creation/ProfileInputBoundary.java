package use_case.profile_creation;

/**
 * Input Boundary for actions which are related to creating a tutor profile.
 */
public interface ProfileInputBoundary {

    /**
     * Executes the profile creation use case.
     * @param profileInputData the input data
     */
    void execute(ProfileInputData profileInputData);

    /**
     * Executes the switch to tutor logged in view use case.
     */
    void switchToTutorLoggedInView();
}
