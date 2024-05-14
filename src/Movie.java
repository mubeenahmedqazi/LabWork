import java.util.Objects;

public class Movie {
    private String title;
    private int year;
    private double rating;
    public Movie(String title, int year, double rating) {
        this.title = title;
        this.year = year;
        this.rating = rating;
    }
    public String getTitle() {
        return title;
    }
    public int getYear() {
        return year;
    }
    public double getRating() {
        return rating;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public void setYear(int year) {
        this.year = year;
    }
    public void setRating(double rating) {
        this.rating = rating;
    }
    @Override
    public String toString() {
        return "Movie [title=" + title + ", year=" + year + ", rating=" + rating + "]";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Movie movie = (Movie) o;
        return Objects.equals(title, movie.title);
    }


}
