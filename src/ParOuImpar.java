import java.util.Scanner;

public class ParOuImpar {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Insira um número.");
        double numeroo = leitor.nextDouble();
        double i  = numeroo;
            if (i % 2 == 0) {
                System.out.println("Seu número é par.");

            } else{
                System.out.println("Seu número é ímpar.");
            }
            leitor.close();
        }
    }
    
