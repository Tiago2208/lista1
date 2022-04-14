import java.util.Scanner;

public class decimal {         
        public static void main(String[] args) {
            System.out.println("Insira o número binário: ");
        Scanner leitor = new Scanner(System.in);
        String entrada = leitor.next();
        int potencia = 0;
        int decimal = 0;
        for (int i = entrada.length() - 1; i >= 0; i--) {
            decimal += Math.pow(2, potencia) * Character.getNumericValue(entrada.charAt(i));
            potencia++;
            leitor.close();
            
        }
        System.out.println("O binário convertido em decimal é: " + decimal);
        
    }
    
}
