package Services;
import Entities.Countries;
import java.util.*;

public class CountriesService {
    Scanner input = new Scanner(System.in).useDelimiter("\n");
    LinkedHashSet<Countries> countriesList = new LinkedHashSet<Countries>();

    public void addCountry(){
        boolean flag = true;
        do{
            createCountry();
            System.out.println("Si desea ingresar otro país, ingrese una letra cualquiera." +
                    "Si desea salir, presione N");
            if (input.next().equalsIgnoreCase("N")) {
                flag = false;
            }
        } while(flag);
    }

    public void showCountryList(){
        System.out.println(countriesList.toString());
    }

    private void createCountry(){
        System.out.println("Ingrese un país.");
        Countries country = new Countries(input.next());
        countriesList.add(country);
    }

    public void sortCountriesListAlphabetically() {
        ArrayList<Countries> countriesArrayList = new ArrayList<>(countriesList);
        countriesArrayList.sort(Comparator.comparing(Countries::getName));
        countriesList = new LinkedHashSet<>(countriesArrayList);
        System.out.println("Ordenada alfabéticamente al derecho");
        showCountryList();
    }

        public void reverseSortCountriesListAlphabetically(){
        ArrayList<Countries> countriesArrayList = new ArrayList<>(countriesList);
        countriesArrayList.sort(Comparator.comparing(Countries::getName).reversed());
        countriesList = new LinkedHashSet<>(countriesArrayList);
        System.out.println("Ordenada alfabéticamente al revés");
        showCountryList();
    }

    public void removeCountryFromList(){
        boolean flag = false;
        System.out.println("Ingrese el país que desea borrar de la lista.");
        String searchedCountry = input.next();
        Iterator<Countries> it = countriesList.iterator();
        while (it.hasNext()){
            if (it.next().getName().equals(searchedCountry)){
                it.remove(); System.out.println("El país fue removido con éxito."); break;
            } else { flag = true;  }
        } if (flag) { System.out.println("No se encontró el país buscado."); }
    }
}
