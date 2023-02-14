public class Rekursion {

    public static int fibonacci(int n) {
        if (n <= 2) return 1;
        return fibonacci(n-1) + fibonacci(n-2);
    }

    private static int fakultät(int n) {
        if (n == 0) return 1;
        return n * fakultät(n-1);
    }

    public static void main(String[] args) {
        int f = fakultät(7);
        System.out.println(f);
        System.out.println( fibonacci(20) );
    }
}
