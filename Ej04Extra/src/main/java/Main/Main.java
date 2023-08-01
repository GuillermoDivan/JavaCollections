package Main;

import Services.PostalCodesService;

public class Main {
    public static void main(String[] args) {
        PostalCodesService service = new PostalCodesService();
        service.menu();
    }
}
