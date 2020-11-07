package sr.unasat.herhaling.app;

import sr.unasat.herhaling.services.TafelService;

public class Application {

    public static void main(String[] args) {


        TafelService tafelService = new TafelService();

       tafelService.tafelVanForloop( 0 , 10 , 10);

        tafelService.tafelVanWhileLoop( 0, 10, 10);

       // tafelService.tafelVanForloop(  10);

       // tafelService.tafelVanWhileLoop(  10);

       // tafelService.tafelVan10Forloop();

       // tafelService.tafelVan10WhileLoop();
    }
}
