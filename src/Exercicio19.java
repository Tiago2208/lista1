import java.util.Scanner;

public class Exercicio19 {
    public static void main(String[] args) {
        System.out.println("Insira a String que você deseja converter em int: ");
        Scanner leitor = new Scanner(System.in);
        String str = leitor.nextLine();
        try {
            int number = Integer.parseInt(str);
            System.out.println("Sua String convertida em int é: " + number);
        } catch (NumberFormatException ex) {
            ex.printStackTrace();
        }
        leitor.close();
    }

}
