public class DesafioFibonacci2Class {

    public static void main(String[] args) {
        int fibonacciNumber = pegarONumeroFibonacciAte(6);
        System.out.println(fibonacciNumber);
    }

    public static int pegarONumeroFibonacciAte(int n) {
        if (n == 0)
            return 0;
        else if (n == 1)
            return 1;
        else
            return pegarONumeroFibonacciAte(n - 1) + pegarONumeroFibonacciAte(n - 2);
    }
}
