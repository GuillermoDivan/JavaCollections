package Services;
import Entities.FamousSinger;
import java.util.ArrayList;
import java.util.Scanner;

public class FamousSingerService {
    ArrayList<FamousSinger> famousSingerList = new ArrayList<>();
    Scanner input = new Scanner(System.in);

    public void addSingerToList(){
        System.out.println("Ingrese el nombre del cantante:");
        String name = input.next();
        System.out.println("Ingrese el nombre de su album más vendido:");
        String album = input.next();
        FamousSinger fs = new FamousSinger(name, album);
        famousSingerList.add(fs);
    }

    public void showSingerList(){
        System.out.println("La lista de cantantes y sus respectivos álbumes es la que sigue:");
        System.out.println(famousSingerList.toString());
    }

    public void removeSingerFromList(){
        boolean flag = true;
        System.out.println("Ingrese el nombre del cantante que desea quitar de la lista.");
        String searchedName = input.next();
        for (FamousSinger singer : famousSingerList){
            if (singer.getName().equalsIgnoreCase(searchedName)){
                famousSingerList.remove(singer);
                System.out.println("El cantante fue quitado con éxito. La lista actual es esta:");
                flag = false; break;
            }
        }
        if (flag) { System.out.println("El nombre no existe en esta lista. La lista actual es esta:"); }
        showSingerList();
    }
}
