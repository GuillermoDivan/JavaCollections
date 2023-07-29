package Services;

import Entitites.NumberList;
import java.util.ArrayList;
import java.util.Scanner;

public class NumberListService {
    Scanner input = new Scanner(System.in).useDelimiter("\n");
    public NumberList addNumberToList(){
        boolean flag = true;
        ArrayList<Integer> numberList = new ArrayList<>();
        do {
            System.out.println("Ingrese el número que desea agregar a la lista. Recuerde que para " +
                    "salir del programa debe ingresar el n° -99.");
            int number = input.nextInt();
            if (number != -99) { numberList.add(number); }
            else {
                System.out.println("Saliendo del programa. Que tenga un buen día.");
                flag = false; }
        } while (flag);
        return new NumberList(numberList);
    }

    public void showNumberList(NumberList nl){
        System.out.println(nl.toString());

    }
}
