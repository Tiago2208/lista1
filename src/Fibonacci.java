public class Fibonacci {
    public static int fib(int n) {
        if (n == 0)
            return 0;
        else if (n <= 2)
            return 1;
        else
            return fib(n - 1) + fib(n - 2);
    }

    public static void main(String[] arg) {
        int n = 0;
        for (int i = 0; n < 100; i++) {
            n = fib(i);
            System.out.println(n);
        }
    }
}
