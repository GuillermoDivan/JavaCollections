package Services;

import Entities.*;
import java.util.*;


public class ServicePelicula {
    ArrayList<Pelicula> movieList = new ArrayList<>();
    Scanner input = new Scanner(System.in).useDelimiter("\n");

    public void createMovie() {
        System.out.println("Ingrese nombre de la película");
        String title = input.next();
        System.out.println("Ingrese nombre del director");
        String director = input.next();
        System.out.println("Ingrese la duración de la película en horas");
        double duration = input.nextDouble();
        Pelicula movie = new Pelicula(title, director, duration);
        movieList.add(movie);
    }

    public void addMovie() {
        boolean flag = true;
        do {
            createMovie();
            System.out.println("¿Desea ingresar otra película? N para salir y cualquier letra para continuar");
            if (input.next().equalsIgnoreCase("n")) {
                flag = false;
            }
        } while (flag);
    }

    public void showMovieList() {
        for (Pelicula aux : movieList) {
            System.out.print(aux.toString());
        }
        System.out.println("");
    }

    public void showLongMovies() {
        for (int i = 0; i < movieList.size(); i++) {
            if (movieList.get(i).getDuration() >= 1) {
                System.out.print("[" + movieList.get(i).toString() + "]");
            }
        }
        System.out.println("");
    }

    public void sortByDurationMovieList() {
        movieList.sort(Comparator.comparing(Pelicula::getDuration));
    }

    public void reverseSortByDurationMovieList() {
        movieList.sort(Comparator.comparing(Pelicula::getDuration).reversed());
    }

    /*public void reverseSortByDurationMovieList() {
        boolean flag;
        for (int i = 0; i < movieList.size() - 1; i++) {
            flag = false;
            for (int j = i + 1; j < movieList.size(); j++) {
                double durationMovieI = movieList.get(i).getDuration();
                double durationMovieJ = movieList.get(j).getDuration();
                Pelicula aux = movieList.get(i);

                if (durationMovieI < durationMovieJ) {
                    movieList.set(i, movieList.get(j));
                    movieList.set(j, aux);
                    flag = true;
                    showMovieList();
                }
            }
            if (!flag) {
                break;
            }
        }
    }

    public void sortByDurationMovieList() {
        boolean flag;
        for (int i = 0; i < movieList.size() - 1; i++) {
            flag = false;
            for (int j = i + 1; j < movieList.size(); j++) {
                double durationMovieI = movieList.get(i).getDuration();
                double durationMovieJ = movieList.get(j).getDuration();
                Pelicula aux = movieList.get(i);

                if (durationMovieI > durationMovieJ) {
                    movieList.set(i, movieList.get(j));
                    movieList.set(j, aux);
                    flag = true;
                }
            }
            if (!flag) {
                break;
            }
        }
    }*/

    /*public void sortByTitleMovieList(){
        Collections.sort(movieList, new MovieComparatorByTitle());
    }*/

    /*public void reverseSortByTitleMovieList(){
        Collections.sort(movieList, new MovieComparatorByTitle());
        Collections.reverse(movieList);
    }*/

    public void sortByTitleMovieList() {
        movieList.sort(Comparator.comparing(Pelicula::getTitle));
    }

    public void reverseSortByTitleMovieList() {
        movieList.sort(Comparator.comparing(Pelicula::getTitle).reversed());
    }

    public void sortByDirectorMovieList(){
        Collections.sort(movieList, new MovieComparatorByDirector());
    }

    public void reverseSortByDirectorMovieList(){
        Collections.sort(movieList, new MovieComparatorByDirector());
        Collections.reverse(movieList);
    }
}
