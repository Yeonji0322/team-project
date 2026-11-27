package use_case.profile_creation;

import entity.Tutor;
import entity.User;
import entity.UserFactory;

/**
 * The Signup Interactor.
 */
public class ProfileCreationInteractor implements ProfileInputBoundary {
    private final ProfileUserDataAccessInterface profileDataAccessObject;
    private final ProfileOutputBoundary userPresenter;
    private final UserFactory userFactory;

    public ProfileCreationInteractor(ProfileUserDataAccessInterface profileDataAccessInterface,
                                     ProfileOutputBoundary profileOutputBoundary, ProfileUserDataAccessInterface profileDataAccessObject,
                                     UserFactory userFactory) {
        this.profileDataAccessObject = profileDataAccessObject;
        this.userPresenter = profileOutputBoundary;
        this.userFactory = userFactory;
    }

    @Override
    public void execute(ProfileInputData profileInputData) {
        if (profileDataAccessObject.existsByName(profileInputData.getTutorName())) {
            userPresenter.prepareFailView("Name is taken. Choose another!");
        }
        else if ("".equals(profileInputData.getTutorName())) {
            userPresenter.prepareFailView("New password cannot be empty");
        }
        else if (profileInputData.getPrice()==0) {
            userPresenter.prepareFailView("Please enter a valid hourly charge.");
        }
        else {
            final Tutor tutor = userFactory.createTutor(ProfileInputData.getTutorName(),
                    profileInputData.getDescription(), profileInputData.getProgram(), profileInputData.getYear(),
                    profileInputData.getCourses(), profileInputData.getPrice(), profileInputData.getContact());
            profileDataAccessObject.save(tutor);

            final ProfileOutputData profileOutputData = new ProfileOutputData(tutor.getTutorName());
            userPresenter.prepareSuccessView(profileOutputData);
        }
    }

    @Override
    public void switchToTutorLoggedInView() {
        userPresenter.switchToTutorLoggedInView();
    }
}