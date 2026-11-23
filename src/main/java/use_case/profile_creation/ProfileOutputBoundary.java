package use_case.profile_creation;

public interface ProfileOutputBoundary {
    /**
     * Prepares the success view for the Profile creation Use Case.
     * @param outputData the output data
     */
    void prepareSuccessView(ProfileOutputData outputData);

    /**
     * Prepares the failure view for the Profile Creation Use Case.
     * @param errorMessage the explanation of the failure
     */
    void prepareFailView(String errorMessage);

    /**
     * Switches to the Tutor Logged In View.
     */
    void switchToTutorLoggedInView();
    }
