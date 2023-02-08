public class Rekursion {

    private static int fakultät(int n) {
        if (n == 0) return 1;
        return n * fakultät(n-1);
    }

    public static void main(String[] args) {
        int f = fakultät(7);
        System.out.println(f);
    }
}
