import java.util.Scanner;

public class inteiroN {
    public static void main(String[] args) {
        System.out.println("Insira um número.");
        Scanner leitor = new Scanner(System.in);
        int n = leitor.nextInt();
        int nn = n * 11;
        int nnn = n * 111;
        int resultado;
        resultado = n + nn + nnn;
        System.out.println("\n" + n + " + " + nn + " + " + nnn + " = " + resultado);
        leitor.close();


    }
    
}
