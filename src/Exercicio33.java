import java.util.Scanner;

public class Exercicio33 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Informe um saldo: ");
        double saldo = leitor.nextDouble();
        double reajuste = saldo * (0.01);
        double saldo2 = saldo + reajuste;
        System.out.println("Seu novo saldo é: " + saldo2);

        leitor.close();
    }
    
}
