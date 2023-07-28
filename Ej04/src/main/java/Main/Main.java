package Main;
import Entities.*;
import Services.ServicePelicula;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        //Test con TreeSet.
        //TreeSet<Pelicula> movieTreeSet = new TreeSet<Pelicula>(new MovieComparatorByDirector());

        ServicePelicula service = new ServicePelicula();
        service.addMovie();
        service.showMovieList();
        //service.showLongMovies();
        /*service.sortByDurationMovieList();
        service.showMovieList();
        service.reverseSortByDurationMovieList();
        service.showMovieList();*/
        /*service.sortByTitleMovieList();
        service.showMovieList();
        service.reverseSortByTitleMovieList();
        service.showMovieList();*/
        /*service.sortByDirectorMovieList();
        service.showMovieList();
        service.reverseSortByDirectorMovieList();
        service.showMovieList();*/
    }
}
