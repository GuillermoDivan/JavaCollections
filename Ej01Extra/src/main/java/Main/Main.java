package Main;
import Entitites.NumberList;
import Services.NumberListService;

public class Main {
    public static void main(String[] args) {
        NumberListService service = new NumberListService();
        NumberList nl = service.addNumberToList();
        service.showNumberList(nl);
    }
}
