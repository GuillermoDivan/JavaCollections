/*Diseñar un programa que lea y guarde razas de perros en un ArrayList de tipo
String. El programa pedirá una raza de perro en un bucle, el mismo se
guardará en la lista y después se le preguntará al usuario si quiere guardar otro perro
o si quiere salir. Si decide salir, se mostrará todos los perros guardados en el ArrayList.

Ej02: Continuando el ejercicio anterior, después de mostrar los perros, al usuario se le pedirá
un perro y se buscará el perro en la lista. Si el perro está en la lista, se eliminará el perro
que ingresó el usuario y se mostrará la lista ordenada. Si el perro no se encuentra en la lista,
se le informará al usuario y se mostrará la lista ordenada.
*/

package Services;
import java.util.ArrayList;
import java.util.Scanner;

public class BreedService {
    public static ArrayList<String> breeds = new ArrayList<>();
    Scanner input = new Scanner(System.in);

    public void addBreed(String breed){
        breeds.add(breed);
    }

    public void addBreed(){
        System.out.println("Ingrese la raza que desea añadir a la lista");
        breeds.add(input.next());
    }

    public void iterate(){
        boolean flag = true;
        do{
            addBreed();
            //addBreed(breed);
            System.out.println("Presione N para salir o cualquier otra letra para continuar");
            if (input.next().equalsIgnoreCase("n")) {flag = false; }
        } while (flag);
        showBreedList();
    }

    public void showBreedList(){
        breeds.toString();
    }

    public boolean lookForBreed(String breed){
        String searchedBreed = breed;
        boolean wasFound = breeds.contains(searchedBreed);
        breedFound(wasFound, searchedBreed);
        return wasFound;
    }

    public void lookForBreed(){
        System.out.println("Ingrese la raza que desea buscar en la lista. Atención: será removida.");
        String searchedBreed = input.next();
        boolean wasFound = breeds.contains(searchedBreed);
        breedFound(wasFound, searchedBreed);
    }

    public void breedFound(boolean wasFound, String searchedBreed){
        if (wasFound) { breeds.remove(searchedBreed);
            System.out.println("La raza "+ searchedBreed +" fue removida de la lista.");}
        else {
            System.out.println("La raza "+ searchedBreed +" no se encontró en la lista.");
        }
        showBreedList();
    }
}
