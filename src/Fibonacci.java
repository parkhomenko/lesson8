/**
 * Created by User on 14.04.2016.
 */
public class Fibonacci {

    public static void main(String[] args) {

    }

    public static int fibonacci(int n) {
        if (n == 1 || n == 2) return 1;

        int result = fibonacci(n - 1) + fibonacci(n - 2);
        return result;
    }
}
