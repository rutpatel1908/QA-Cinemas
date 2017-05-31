package Sources;

public class Operation {

    public static void main(String [] args){

        MovieDatabase database=new MovieDatabase();
        Movie movie1=new Movie(0,"The Boss Baby","Comedy","120 minutes","01 Apr 2017 ","A seven-year-old manner of a businessman.");
        Movie movie2=new Movie(1,"The Hunter", "Drama", "95 minutes","01 Apr 2017 ","Adventure starring The Sons of Anarchy's Charlie Hunnam as King Arthur");
        Movie movie3=new Movie(2,"The King Arthur", "Adventure", "90 minutes","01 March 2017","Wears a suit and has the brusque manner of a businessman");
        database.addMovie(movie1);
        database.addMovie(movie2);
        database.addMovie(movie3);

        CinemaListings schedule=new CinemaListings();

        schedule.addMovie(database.getMovieByIndex(1), "Friday", database.getMovieFilmID(1),new String[]{"16:00","19:00"});
        schedule.addMovie(database.getMovieByIndex(2), "Thrusday", database.getMovieFilmID(2),new String[]{"16:00","19:00"});

        String retrieveMovieName = schedule.getMovies("Friday").toString();
        String retrieveTime = schedule.getMovieTime().toString();

        Order order=new Order(retrieveMovieName,"Friday",retrieveTime,1,1,1,1);
        System.out.println(order);

    }

}
