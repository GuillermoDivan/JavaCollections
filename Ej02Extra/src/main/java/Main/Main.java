package Main;

import Entities.FamousSinger;
import Services.MenuService;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        MenuService service = new MenuService();
        service.startMenu();
    }
}
