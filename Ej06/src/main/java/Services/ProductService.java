package Services;
import Entities.*;

import java.sql.SQLOutput;
import java.util.*;

public class ProductService {
    HashMap<String, Double> ProductList = new HashMap();
    Scanner input = new Scanner(System.in).useDelimiter("\n");

    public void createProductInProductList() {
        System.out.println("Ingrese el nombre del producto que desea agregar.");
        String name = input.next();
        System.out.println("Ingrese el precio del producto.");
        double price = input.nextDouble();
        Product product = new Product(name, price);
        ProductList.put(name, price);
    }

    public void showProductList() {
        System.out.print(ProductList.toString());
        System.out.println("");
    }

    public void modifyPriceOnProductList() {
        System.out.println("Ingrese el nombre del producto cuyo precio desea actualizar.");
        String searchedProduct = input.next();
        System.out.println("Ingrese el nuevo valor para el producto.");
        double newPrice = input.nextDouble();
        if (ProductList.containsKey(searchedProduct)){
            ProductList.put(searchedProduct, newPrice);}
        else { System.out.println("No se encontró el elemento en la lista."); }
        System.out.println("La lista ha quedado de este modo luego de las modificaciones:");
        showProductList();
    }

    public void removeProductOnProductList() {
        boolean found = false;
        System.out.println("Ingrese el nombre del producto que desea remover de la lista.");
        String searchedProduct = input.next();
            if (ProductList.containsKey(searchedProduct)){
                ProductList.remove(searchedProduct);
                System.out.println("El elemento fue removido con éxito.");
                found = true;
            }
        if (!found) {
            System.out.println("No se encontró el elemento en la lista.");
        }
        showProductList();
    }


}
