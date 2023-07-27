package Entities;

import java.util.Comparator;

public class MovieComparator implements Comparator<Pelicula> {
    @Override
    public int compare(Pelicula o1, Pelicula o2) {
        return o1.getTitle().compareTo(o2.getTitle());
    }

    @Override
    public Comparator<Pelicula> reversed() {
        return Comparator.super.reversed();
    }
}
