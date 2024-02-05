/**
 * Media
 */
public class Media {

    private String title;
    private int year;
    private String[] genre;
    private String director;

    public Media(String title, int year, String[] genre, String director) {
        this.title = title;
        this.year = year;
        this.genre = genre;
        this.director = director;
    }

    public String getGenre() {
        String genres = "";
        for (int i = 0; i < genre.length; i++) {
            genres += genre[i];
            if (i < genre.length - 1) {
                genres += ", ";
            }
        }
        return genres;
    }
    public String getDirector() {
        return director;
    }
    public String getTitle() {
        return title;
    }
    public int getYear() {
        return year;
    }
    public void setDirector(String director) {
        this.director = director;
    }
    public void setGenre(String[] genre) {
        this.genre = genre;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public void setYear(int year) {
        this.year = year;
    }


}