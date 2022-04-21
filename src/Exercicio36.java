import java.util.Scanner;

public class Exercicio36 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite um número inteiro: ");
        int numero = leitor.nextInt();
        int antecessor = numero - 1;
        int sucessor = numero + 1;
        System.out.println("O antecessor desse número é: " + antecessor);
        System.out.println("O sucessor desse número é: " + sucessor);
        leitor.close();
    }
    
}
