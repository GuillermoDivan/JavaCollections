package Services;
import Entities.*;
import java.util.HashMap;
import java.util.Scanner;

public class ProductService {
    HashMap<String, Double> ProductList = new HashMap();
    Scanner input = new Scanner(System.in).useDelimiter("\n");
    public void createProductInProductList(){
        System.out.println("Ingrese el nombre del producto que desea agregar.");
        String name = input.next();
        System.out.println("Ingrese el precio del producto.");
        double price = input.nextDouble();
        Product product = new Product(name, price);
        ProductList.put(name, price);
    }

    public void showProductList(){
        System.out.println(ProductList.toString());
    }

    public void modifyPriceOnProductList(){
        System.out.println("Ingrese el nombre del producto cuyo precio desea actualizar.");
        String searchedProduct = input.next();

    }

    public void removeProductOnProductList(){
        System.out.println("Ingrese el nombre del producto que desea remover de la lista.");
        String searchedProduct = input.next();
        ProductList.remove(searchedProduct);
        System.out.println("La lista actualizada (sin " + searchedProduct + ") es la siguiente:");
        showProductList();
        //Analizar caso negativo...
    }
}

/*

* */