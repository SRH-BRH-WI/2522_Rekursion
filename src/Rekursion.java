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

    private static int fakultät(int n) {
        if (n == 0) return 1;
        return n * fakultät(n-1);
    }

    public static void main(String[] args) {
        int f = fakultät(7);
        System.out.println(f);

        long zeit = System.currentTimeMillis();
        System.out.println( fibonacci(50) );
        zeit = System.currentTimeMillis() - zeit;
        System.out.println("Die Berechnung hat " + zeit + "ms gedauert.");
        System.out.println("Die Methode wurde " + aufruf_zähler + " Mal aufgerufen");
    }
}
