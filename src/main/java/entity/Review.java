package entity;

public class Review {
    private final User reviewer;
    private final Tutor tutor;
    private final int rating;
    private final String description;

    public Review(User reviewer, Tutor tutor, int rating, String description) {
        this.reviewer = reviewer;
        this.tutor = tutor;
        this.rating = rating;
        this.description = description;
    }
}
