import java.util.Scanner;

public class operacoes {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double numero1;
        double numero2;

        System.out.println("Insira o primeiro número: ");
        numero1 = entrada.nextDouble();
        System.out.println("Insira o segundo número: ");
        numero2 = entrada.nextDouble();

        System.out.println(numero1 + " + " + numero2 + " = " + (numero1 + numero2));
        System.out.println(numero1 + " - " + numero2 + " = " + (numero1 - numero2));
        System.out.println(numero1 + " * " + numero2 + " = " + (numero1 * numero2));
        System.out.println(numero1 + " / " + numero2 + " = " + (numero1 / numero2));
        System.out.println(numero1 + " % " + numero2 + " = " + (numero1 % numero2));
        entrada.close();
        
    }
    
}
