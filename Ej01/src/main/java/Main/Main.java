package Main;
import Services.BreedService;

public class Main {
    public static void main(String[] args) {
        BreedService bs = new BreedService();
        bs.iterate();
        bs.lookForBreed();

    }
}
