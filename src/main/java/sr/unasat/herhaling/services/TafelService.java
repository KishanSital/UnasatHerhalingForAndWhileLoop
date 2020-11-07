package sr.unasat.herhaling.services;

public class TafelService {

    public static void tafelVanForloop( int tafel){

        System.out.println("Tafel van "+ tafel +" For loop");

        for( int i = 0; i <= tafel; i++){

            System.out.println( i + " * " +  tafel + " = " + i * tafel );

        }

    }


    public static void tafelVanWhileLoop( int tafel){
        int startNumber = 0;
        int  finishedNumber = tafel;
        System.out.println();
        System.out.println("Tafel "+ tafel +" loop");
        while ( startNumber <= finishedNumber){

            System.out.println( startNumber + " * " +  tafel +" = " +  startNumber * tafel  );
            startNumber++;
        }
    }
}
