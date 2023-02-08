public class Methoden {

    static int dasx = 42;                           // x: globale Variable (Klassenvariable)

    // Call-By-Value (CbV) und Call-By-Reference (CbR)
    // wird von Java selbst festgelegt und kann vom Programmierer nicht verändert werden
    // CbV wird verwendet bei: primitiven Datentypen
    // boolean, byte, short, int, long, char, float, double
    // CbR wird verwendet bei: komplexen Datentypen (Referenzdatentypen)
    // alle anderen: Array, String, und Objekten

    // Frage: geht sowas?
    private static void swap(String a, String b) {
        String temporär = a;
        a = b;
        b = temporär;
    }

    // formale Variable dasx ist ein Call-By-Value Parameter
    // -> formale Variable dasx ist eine neue, eigenständige Variable
    //    und hat keine Beziehung zu einer anderen Variablen gleichen Namens
    private static void machWasMitDerZahl(int dasx) {      // x: formale Variable
        dasx = dasx * 3;
        System.out.println("in der Methode: " + dasx);
    }

    // formale Variable feld ist ein Call-By-Referenz Parameter
    // -> dabei handelt es sich um die identische Variable des Aufrufers,
    //    und hat dabei vielleicht nur einen anderen Namen
    private static void machWasMitDemVektor(int[] feld) {
        feld[0] = 32;
        System.out.println("in der anderen Methode: " + feld[0]);
    }


    public static void main(String[] args) {
        int[] vektor = { 1, 2, 3, 4, 5 };
        int dasx = 17;                                     // x: lokale Variable
        machWasMitDerZahl(dasx); // wir wollen hier nur den Wert von x wissen
        System.out.println(dasx);
        machWasMitDemVektor( vektor );
        System.out.println( vektor[0] );

        String s1 = "Hallo";
        String s2 = "Welt";
        swap(s1, s2);   // <- vertauschen klappt nicht!
        System.out.println(s1 + " " + s2);
    }
}
