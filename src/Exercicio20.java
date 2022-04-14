import java.util.Scanner;

public class Exercicio20 {
    public static void main(String[] args) {
        System.out.println("Insira o primeiro número: ");
        Scanner leitor = new Scanner(System.in);
        int number1 = leitor.nextInt();
        System.out.println("Insira o segundo número: ");
        int number2 = leitor.nextInt();
        System.out.println("Insira o terceiro número: ");
        int resultado = leitor.nextInt();

        if (number1 + number2 == resultado) {
            System.out.println(true);

        } else {
            System.out.println(false);

        }
        leitor.close();
    }

}
