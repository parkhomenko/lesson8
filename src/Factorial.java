public class Factorial {

    public static void main(String[] args) {
        int result = factorial(5);
        System.out.println(result);
    }

    public static int factorial(int n) {
        if (n <= 1) return 1;

        int result = factorial(n - 1);
        result = result * n;
        return result;
    }
}
