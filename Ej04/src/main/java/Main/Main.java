package Main;

import Services.ServicePelicula;

public class Main {
    public static void main(String[] args) {
        ServicePelicula service = new ServicePelicula();
        service.addMovie();
        service.showMovieList();
        service.showLongMovies();
        service.sortByDurationMovieList();
        service.showMovieList();
        service.reverseSortByDurationMovieList();
        service.showMovieList();
        service.sortByTitleMovieList();
        service.showMovieList();
        service.reverseSortByTitleMovieList();
        service.showMovieList();
        service.sortByDirectorMovieList();
        service.showMovieList();
        service.reverseSortByDirectorMovieList();
        service.showMovieList();
    }
}
