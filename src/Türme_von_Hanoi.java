public class Türme_von_Hanoi {

    public static void main(String[] args) {
        int anzahlScheiben = 3;

        bewegeScheiben(anzahlScheiben, "A - Start", "B - Zwischen", "C - Ziel");
    }

    private static void bewegeScheiben(int anzahlScheiben, String start, String zwischen, String ziel) {
        if (anzahlScheiben > 0) {
            bewegeScheiben(anzahlScheiben - 1, start, ziel, zwischen);
            System.out.println("Bewege Scheibe von " + start + " nach " + ziel);
            bewegeScheiben(anzahlScheiben - 1, zwischen, start, ziel);
        }
    }
}
