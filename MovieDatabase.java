package Sources;

import java.util.ArrayList;
import java.util.List;

public class MovieDatabase {

    public List<Movie> films=new ArrayList<Movie>();

    public void addMovie(Movie movie){
        films.add(movie);
    }

    public void removeMovie(Movie movie){
        films.remove(movie);
    }

    public Movie getMovieByIndex(int index){
        return films.get(index);
    }

    public int getMovieFilmID(int index){
        return films.get(index).getFilmID();
    }

    public List<Movie> getAllMovies(){
        return films;
    }

}
