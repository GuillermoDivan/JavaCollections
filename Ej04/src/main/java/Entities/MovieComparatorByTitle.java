/* Comparator tiene que construirse como clase para implementar "comparator"...
El tipo en cuestión es el Objeto, se busca sobreescribir método "compare" para que compare según atributo
deseado. Si no, la otra forma es nombreArrayList.sort(Comparator.comparing(Objeto::getAtributo);
y ".reversed()" al final si se quiere invertir.
*/

package Entities;

import java.util.Comparator;

public class MovieComparatorByTitle implements Comparator<Pelicula> {
    @Override
    public int compare(Pelicula o1, Pelicula o2) {
        return o1.getTitle().compareTo(o2.getTitle());
    }

    @Override
    public Comparator<Pelicula> reversed() {
        return Comparator.super.reversed();
    }
}
