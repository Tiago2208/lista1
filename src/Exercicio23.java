import java.util.Scanner;

public class Exercicio23 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Informe o primeiro número: ");
        int N1 = leitor.nextInt();
        System.out.println("Informe o segundo número: ");
        int N2 = leitor.nextInt();
        System.out.println("Informe o terceiro número: ");
        int N3 = leitor.nextInt();
        if (N1 >= 20 || N2 >= 20 || N3 >= 20 ) {
            
        } if (N1 < (N2 - N3) || N2 < (N1 - N3) || N3 < (N1 - N2)) {
            System.out.println(true);
            
        } else{
            System.out.println(false);
        } leitor.close();
    }
    
}
