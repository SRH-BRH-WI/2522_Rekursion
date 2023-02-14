public class Rekursion {

    private static long[] fibonacci_werte = new long[100];  // dieses Array hat lauter 0-Werte
        //{ 0, 1, 1, 2, 3, 5, ... } // 100 Stück ..

    private static long aufruf_zähler = 0;

    public static long fibonacci(long n) {
        aufruf_zähler++;

        if (fibonacci_werte[ (int)n ] > 0)
            return fibonacci_werte[ (int)n ];

        long ergebnis = 1;
        if (n > 2) ergebnis = fibonacci(n-1) + fibonacci(n-2);
        fibonacci_werte[ (int)n ] = ergebnis;
        return ergebnis;
    }

    private static long fibonacci_iterativ(long n) {
        long ergebnis = 1;
        if (n > 2) {
            n -= 2; // das gleiche wie: n = n - 2;
            long f_n_1 = 1;
            long f_n_2 = 1;
            while (n > 0) {
                ergebnis = f_n_1 + f_n_2; // aktuelle Berechnung
                f_n_2 = f_n_1;
                f_n_1 = ergebnis;
                n--;
            }
        }
        return ergebnis;
    }

    private static int fakultät(int n) {
        if (n == 0) return 1;
        return n * fakultät(n-1);
    }

    public static void main(String[] args) {
        int f = fakultät(7);
        System.out.println(f);

        long zahl_zum_berechnen = 60;

        long zeit = System.nanoTime();
        System.out.println( fibonacci(zahl_zum_berechnen) );
        zeit = System.nanoTime() - zeit;
        System.out.println("Die rekursive Berechnung hat " + zeit + "ns gedauert.");
        System.out.println("Die Methode wurde " + aufruf_zähler + " Mal aufgerufen");

        zeit = System.nanoTime();
        System.out.println( fibonacci_iterativ(zahl_zum_berechnen) );
        zeit = System.nanoTime() - zeit;
        System.out.println("Die iterative Berechnung hat " + zeit + "ns gedauert.");
    }
}
