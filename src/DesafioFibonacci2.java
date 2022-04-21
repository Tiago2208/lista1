public class DesafioFibonacci2 {
    public static void main(String[] args) {
        int maxCount = 10;
        for (int i = 0; i <= maxCount; i++) {
            int fibonacciNumber = escrevaFibonacci(i);
            System.out.print(" " + fibonacciNumber);
        }
    }

    public static int escrevaFibonacci(int n) {
        if (n == 0)
            return 0;
        else if (n == 1)
            return 1;
        else
            return escrevaFibonacci(n - 1) + escrevaFibonacci(n - 2);
    }

}
