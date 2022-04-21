import java.util.Scanner;

public class Exercicio30 {
    public static void main(String[] args) { 
        System.out.println("informe dois numeros:");
        Scanner leitor = new Scanner(System.in);
        int a = leitor.nextInt();
        int b = leitor.nextInt();
       for ( a = 0; a < 5; a++) {
           for ( b = 1; b <= a; b++) {
               System.out.print(a * b );
           }
           System.out.println("");
       }
    }
    
}
