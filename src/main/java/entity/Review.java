package entity;

public class Review {
    private final User reviewer;
    private final Tutor tutor;
    private float rating;
    private String contents;

    public Review(User reviewer, Tutor tutor, int rating, String contents) {
        this.reviewer = reviewer;
        this.tutor = tutor;
        this.rating = rating;
        this.contents = contents;
    } //are setters needed here for reviewer or tutor...? i know they are for contents and rating because of editability

    public float getRating() {
        return this.rating;
    }

    public void setRating(float rating) {
        this.rating = rating;
    }

    public String getContents() {
        return this.contents;
    }

    public void setContents(String contents) {
        this.contents = contents;
    }


}
