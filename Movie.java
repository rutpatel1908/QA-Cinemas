package Sources;

public class Movie {


    String movieName, movieGenre,runningTime, releaseDate, movieDescription;
    int filmID;

    public Movie(){};

    public Movie(int filmID,String movieName, String movieGenre, String runningTime, String releaseDate, String movieDescription) {
        this.filmID = filmID;
        this.movieName = movieName;
        this.movieGenre = movieGenre;
        this.runningTime = runningTime;
        this.releaseDate = releaseDate;
        this.movieDescription = movieDescription;
    }

    public int getFilmID() {
        return filmID;
    }

    public String getMovieName() {
        return movieName;
    }

    public String getMovieGenre() {
        return movieGenre;
    }

    public String getRunningTime() {
        return runningTime;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public String getMovieDescription() {
        return movieDescription;
    }

    @Override
    public String toString() {
        return
                "movieName='" + movieName + '\'' +
                ", movieGenre='" + movieGenre + '\'' +
                ", runningTime='" + runningTime + '\'' +
                ", releaseDate='" + releaseDate + '\'' +
                ", movieDescription='" + movieDescription;
    }
}
