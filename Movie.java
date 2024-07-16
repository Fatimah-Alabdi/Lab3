import java.util.ArrayList;
import java.util.List;

public class Movie extends Media{
    private int duration;
    public Movie(String title, String auteur, String ISBN, double price,int duration) {
        super(title, auteur, ISBN, price);
        this.duration = duration;
    }
    public int getDuration() {
        return duration;
    }
    public void setDuration(int duration) {
        this.duration = duration;
    }
    public void watch(User user){
        user.getPurchasedMediaList();


    }
    public List<Movie> recommendSimilarMovies(List<Movie> movieCatalog){
        List<Movie> similarMovies = new ArrayList<>();
        for (Movie movie : movieCatalog) {
            if (movie.getAuteur().equals(this.getAuteur())) {
                similarMovies.add(movie);
            }
        }
        return similarMovies;


    }
    public String getMediaType(){
        if(duration>=120){
            return "Long Movie";

        }
        else
        return "movie";
    }

    @Override
    public String toString() {
        return "Movie{" +
                "duration=" + duration +
                '}' +super.toString();
    }
}
