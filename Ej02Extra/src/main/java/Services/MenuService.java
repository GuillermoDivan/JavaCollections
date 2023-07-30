package Services;

import java.util.Scanner;

public class MenuService {
    Scanner input = new Scanner(System.in);
    public void startMenu(){
        FamousSingerService fss = new FamousSingerService();
        boolean flag = true;
        do{
            System.out.println("Bienvenidx. ¿Qué desea hacer? 1) Ingresar cantante." +
                    " 2) Mostrar lista de cantantes y albumes. 3) Borrar unx cantante de la lista." +
                    " 4) Salir.");
            int option = input.nextInt();
            switch(option){
                case 1: fss.addSingerToList(); break;
                case 2: fss.showSingerList(); break;
                case 3: fss.removeSingerFromList(); break;
                case 4:
                    System.out.println("Saliendo del programa. Que tengas un buen día.");
                    flag = false; break;
            }
        } while(flag);

    }
}
