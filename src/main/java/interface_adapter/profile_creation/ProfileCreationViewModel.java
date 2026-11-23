package interface_adapter.profile_creation;

import java.util.ArrayList;
import java.util.List;

public class ProfileCreationViewModel {

    /**
     * The ViewModel for the Signup View.
     */
        public static final String WINDOW_LABEL = "Create Profile";
        public static final String NAME_LABEL = "Name:";
        public static final String TITLE_LABEL = "Program and year, or occupation:";
        public static final String COURSE_LABEL = "Courses:";
        public static final String PRICE_LABEL = "Hourly charge:";

        public static final String DESCRIPTION_LABEL = "Description:";
        public static final String CONTACT_LABEL = "Contact:";

        public static final String SAVE_BUTTON_LABEL = "SAVE";
        public static final String COURSE_BUTTON_LABEL = "+ADD";
        public static final String BACK_BUTTON_LABEL = "BACK";

        private final List<ProfileCreationViewModelListener> listeners = new ArrayList<>();

        public static final String VIEW_NAME = "profile creation";

        private ProfileCreationState state = new ProfileCreationState();

        public ProfileCreationState getState() {
            return this.state;
        }

        public void setState(ProfileCreationState state) {
            this.state = state;
        }

        public void addListener(ProfileCreationViewModelListener listener) {
            listeners.add(listener);
        }

        public void notifyStateChanged() {
            for (ProfileCreationViewModelListener listener : listeners) {
                listener.stateChanged();
            }
        }
    }
}
