package sr.unasat.herhaling.app;

import sr.unasat.herhaling.services.TafelService;

public class Application {

    public static void main(String[] args) {


        TafelService tafelService = new TafelService();

       tafelService.tafelVanForloop( 12);

        tafelService.tafelVanWhileLoop( 12);

        tafelService.tafelVan10Forloop();

        tafelService.tafelVan10WhileLoop();
    }
}
