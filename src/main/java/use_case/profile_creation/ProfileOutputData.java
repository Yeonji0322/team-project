package use_case.profile_creation;

public class ProfileOutputData {
    private final String username;

    public ProfileOutputData(String username) {
        this.username = username;
    }

    public String getUsername() {
        return username;
    }

}
