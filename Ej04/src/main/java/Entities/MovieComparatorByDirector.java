//Clases comparator para sobreescribir e implementar el método que compara.
package Entities;
import java.util.Comparator;
public class MovieComparatorByDirector implements Comparator<Pelicula> {
    @Override
    public int compare(Pelicula o1, Pelicula o2) {
        return o1.getDirector().compareTo(o2.getDirector());
    }

    @Override
    public Comparator<Pelicula> reversed() {
        return Comparator.super.reversed();
    }
}
