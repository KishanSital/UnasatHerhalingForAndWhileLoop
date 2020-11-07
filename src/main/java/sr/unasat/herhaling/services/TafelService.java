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

    public static void tafelVan10Forloop(){

        System.out.println("Tafel van 10 For loop");

        for( int i = 0; i <= 10; i++){

            System.out.println( i + "* 10 = " + i * 10 );

        }

    }


    public static void tafelVan10WhileLoop(){
        int startNumber = 0;
        int  finishedNumber = 10;
        System.out.println();
        System.out.println("Tafel van 10 While loop");
        while ( startNumber <= finishedNumber){

            System.out.println(startNumber + " *" + " 10 = " +  startNumber * 10  );
            startNumber++;
        }
    }


    public static void tafelVanForloop( int begin , int eind,  int tafel){

        System.out.println("Tafel van "+ tafel +" For loop");

        for( int i = begin; i <= eind; i++){

            System.out.println( i + " * " +  tafel + " = " + i * tafel );

        }

    }


    public static void tafelVanWhileLoop( int begin, int eind, int tafel){

        System.out.println();
        System.out.println("Tafel "+ tafel +" loop");
        while ( begin <= eind){

            System.out.println( begin + " * " +  tafel +" = " +  begin * tafel  );
            begin++;
        }
    }


}
