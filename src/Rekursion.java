public class Rekursion {

    private static int fakultät(int n) {
        return n * fakultät(n-1);
    }

    public static void main(String[] args) {
        int f = fakultät(7);
        System.out.println(f);
    }
}
