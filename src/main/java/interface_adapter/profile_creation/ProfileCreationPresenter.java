package interface_adapter.profile_creation;

import interface_adapter.ViewManagerModel;
import interface_adapter.logged_in.StudentLoggedInViewModel;
import interface_adapter.logged_in.TutorLoggedInState;
import interface_adapter.logged_in.TutorLoggedInViewModel;
import use_case.profile_creation.ProfileOutputBoundary;
import use_case.profile_creation.ProfileOutputData;

public class ProfileCreationPresenter implements ProfileOutputBoundary {
    private final ViewManagerModel viewManagerModel;
    private final StudentLoggedInViewModel studentLoggedInViewModel;

    public ProfileCreationPresenter(ViewManagerModel viewManagerModel,
                                  StudentLoggedInViewModel studentLoggedInViewModel) {
        this.viewManagerModel = viewManagerModel;
        this.studentLoggedInViewModel = studentLoggedInViewModel;
    }

    public void switchToUserHomeView() {
        viewManagerModel.setState(studentLoggedInViewModel.getViewName());
        viewManagerModel.notifyViewChanged();
    }

    @Override
    public void prepareSuccessView(ProfileOutputData outputData) {
        // on success, switch to the tutor logged in view.
        final TutorLoggedInState tutorLoggedInState = tutorLoggedInViewModel.getState();
        tutorLoggedInState.setUsername(response.getUsername());
        studentLoggedInViewModel.notifyStateChanged();

        viewManagerModel.setState(TutorLoggedInViewModel.VIEW_NAME);
        viewManagerModel.notifyViewChanged();
    }

    @Override
    public void prepareFailView(String errorMessage) {

    }

    @Override
    public void switchToTutorLoggedInView() {

    }
}
