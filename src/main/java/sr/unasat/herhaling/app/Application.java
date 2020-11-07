package sr.unasat.herhaling.app;

import sr.unasat.herhaling.services.TafelService;

public class Application {

    public static void main(String[] args) {


        TafelService tafelService = new TafelService();

       tafelService.tafelVan10Forloop();

        tafelService.tafelVan10WhileLoop();
    }
}
