import java.util.Scanner;

public class somaDe1A1000 {
    public static void main(String[] args) {
        System.out.println("Imprima a soma de 1 a 1000.");
        int soma = 0;
        int ultimoValor;
        for (int i = 1; i <= 1000; i++) {
            ultimoValor = soma;
            soma += i;
            System.out.println("\n" + ultimoValor + " + " + i + " = " + soma);
        }

    }

}
