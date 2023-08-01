package Services;

import Entities.PostalCodes;

import java.util.HashMap;
import java.util.Scanner;

public class PostalCodesService {
    HashMap<String, String> postalCodesMap = new HashMap<>();
    Scanner input = new Scanner(System.in).useDelimiter("\n");

    private void addPostalCodeToMap() {
        System.out.println("Ingrese el código postal que desea incluir (SÓLO NÚMEROS).");
        String postalCode = input.next();
        System.out.println("Ingrese el nombre de la ciudad.");
        String cityName = input.next();
        postalCodesMap.put(postalCode, cityName);
    }

    private void showPostalCodeMap() {
        System.out.println(postalCodesMap);
    }

    private void lookForPostalCode() {
        System.out.println("Ingrese el código postal buscado.");
        String searchedPC = input.next();
        if (postalCodesMap.containsKey(searchedPC)) {
            System.out.println("El código postal buscado corresponde a: " + postalCodesMap.get(searchedPC));
        } else {
            System.out.println("El código postal buscado no figura en la lista.");
        }
        showPostalCodeMap();
    }

    private void removePostalCodeFromMap(){
        System.out.println("Ingrese el código postal que desea remover de la lista.");
        String searchedPC = input.next();
        if (postalCodesMap.containsKey(searchedPC)) {
            System.out.println("El código postal buscado corresponde a: " + postalCodesMap.remove(searchedPC));
        } else {
            System.out.println("El código postal buscado no figura en la lista.");
        }
        showPostalCodeMap();
    }

    public void menu() {
        int option = 0;
        do {
            System.out.println("Ingrese la opción que desea realizar: 1) Agregar Código Postal a la lista." +
                    " 2) Buscar Ciudad según Código Postal. 3) Remover Código Postal de la lista." +
                    " 4) Ver la lista de Códigos Postales y Ciudades. 5) Salir");
            option = input.nextInt();
            switch(option){
                case 1: addPostalCodeToMap(); break;
                case 2: lookForPostalCode(); break;
                case 3: removePostalCodeFromMap(); break;
                case 4: showPostalCodeMap(); break;
                default:
                    System.out.println("Saliendo de programa. Que tengas un buen día.");
            }
        } while (option > 0 && option < 5);
    }

}
