import java.util.Scanner;

public class Exercicio35 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Informe o salário mínimo: ");
        double sm = leitor.nextDouble();
        System.out.println("Insira o seu salário: ");
        double salario = leitor.nextDouble();
        double resultadoFinal = salario / sm;
        System.out.println("Você recebe " + String.format("%.2f", resultadoFinal) + " " + "salários mínimos");
        leitor.close();

    }
    
}
