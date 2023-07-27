package Main;

import Services.CountriesService;

public class Main {
    public static void main(String[] args) {
        CountriesService cs = new CountriesService();
        cs.addCountry();
        cs.showCountryList();
        //cs.sortCountriesListAlphabetically();
        cs.removeCountryFromList();
        cs.showCountryList();
    }
}
