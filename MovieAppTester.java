package Test;

import Sources.Movie;
import Sources.MovieDatabase;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by Global InfoTech Dev on 31/05/2017.
 */
public class MovieAppTester {

    @Test
    public void createNewMovie() {
        Movie movie=new Movie(2,"The King Arthur", "Adventure", "90 minutes","01 March 2017","Wears a suit and has the brusque manner of a businessman");
        String title=movie.getMovieName();
        assertEquals(title,"The King Arthur");

    }

    @Test
    public void insertMovieIntoDatabase() {
        Movie movie1=new Movie(2,"The King Arthur", "Adventure", "90 minutes","01 March 2017","Wears a suit and has the brusque manner of a businessman");
        MovieDatabase insertMovie = new MovieDatabase();
        insertMovie.addMovie(movie1);
        List<Movie> databaseMovies=insertMovie.getAllMovies();
        assertNotNull(databaseMovies.size());
    }


}