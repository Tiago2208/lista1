import java.util.Scanner;

public class Exercicio34 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Qual o valor do IPI?");
        double IPI = leitor.nextDouble();
        System.out.println("Qual o valor da peça 1?");
        double valorPeca1 = leitor.nextDouble();
        System.out.println("Qual o valor da peça 2?");
        double valorPeca2 = leitor.nextDouble();
        System.out.println("Qual a quantidade de peças 1?");
        int qntdPeca1 = leitor.nextInt();
        System.out.println("Qual a quantidade de peças 2?");
        int qntdPeca2 = leitor.nextInt();
        double resultado = ((valorPeca1*qntdPeca1) + (valorPeca2*qntdPeca2))*((IPI/100) + 1);
        System.out.println("O valor total a ser pago é: " + resultado);
        leitor.close();



    }

}
