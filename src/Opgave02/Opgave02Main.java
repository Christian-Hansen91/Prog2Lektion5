package Opgave02;

public class Opgave02Main {
    public static int fibonacci(int n, int[] results) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        if (results[n - 1] == -1) {
            results[n - 1] = fibonacci(n - 1, results);
        }
        if (results[n - 2] == -1) {
            results[n - 2] = fibonacci(n - 2, results);
        }

        return results[n - 1] + results[n - 2];
    }
}
