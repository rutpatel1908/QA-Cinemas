package Sources;

import java.util.*;

public class CinemaListings {


    public Map<Movie, String> moviesList = new HashMap();
    public Map<Integer, String[]> movieTimes = new HashMap();
    public Map<Movie, String> mov1 = new HashMap();

    int filmID;

    public void addMovie(Movie movie, String screeningDay, int movieIndex, String[] showTimes){
        moviesList.put(movie,screeningDay);
        movieTimes.put(movieIndex,showTimes);
    }

    public String getMovies(String day){

        String movieName = "";

        for (Map.Entry<Movie, String> entry : moviesList.entrySet()) {

            if( entry.getValue() != null && entry.getValue().equals(day)) {

                movieName = entry.getKey().getMovieName();

                filmID = entry.getKey().getFilmID();

                return movieName;
            }
        }

        return movieName;
    }

    public String getMovieTime(){

        String time = "";

        for (Map.Entry<Integer, String[]> entry1 : movieTimes.entrySet()) {

            if(entry1.getKey() != null && entry1.getKey().equals(filmID)){


                time = entry1.getValue()[0];
                return time;
            }
        }

        return time;
    }

}
