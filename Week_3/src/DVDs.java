public class DVDs {

    private String title;
    private String director;

    public DVDs(String title, String director) {
        this.title = title;
        this.director = director;
    }

    public String toString() {
        return "Title: " + title + " Director: " + director;
    }
}
