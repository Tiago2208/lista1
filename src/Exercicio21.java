import java.util.Scanner;

public class Exercicio21 {
    public static void main(String[] args) {
        System.out.println("Insira o primeiro número: ");
        Scanner leitor = new Scanner(System.in);
        int n1 = leitor.nextInt();
        System.out.println("Insira o segundo número: ");
        int n2 = leitor.nextInt();
        System.out.println("Insira o terceiro número: ");
        int n3 = leitor.nextInt();

        if ((n1< n2) && (n2 < n3)) {
            System.out.println(true);

        } else {
            System.out.println(false);

        }
        leitor.close();
    }

}
