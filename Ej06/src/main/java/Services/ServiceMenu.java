package Services;

import java.util.Scanner;

public class ServiceMenu {
    Scanner input = new Scanner(System.in).useDelimiter("\n");
    public void menuStore(){
        ProductService ps = new ProductService();
        boolean flag = true;
        do {
            System.out.println("Seleccione qué acción desea realizar. 1) Agregar producto a la lista. | " +
                    " 2) Editar precio de un producto existente. | 3) Retirar un producto de la lista. | " +
                    "4) Mostrar la lista de productos. | 5) Salir. ");
            switch(input.nextInt()){
                case 1: ps.createProductInProductList(); break;
                case 2: ps.modifyPriceOnProductList(); break;
                case 3: ps.removeProductOnProductList(); break;
                case 4: ps.showProductList(); break;
                case 5: flag = false;
                    System.out.println("Saliendo del programa. Que tengas una linda jornada.");
                    break;
                default:
                    System.out.println("Opción no válida, vuelva a intentarlo.");
            }
        } while (flag);
    }
}
