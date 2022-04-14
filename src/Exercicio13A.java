
public class Exercicio13A {
    public static void main(String[] args) {
        int contador = 0;
        for (int i = 2; i <= 4; i++) {
            for (int j = 2; j <= 4; j++) {
                for (int k = 4; k >= 2; k--) {
                    System.out.println("" + i + j + k);
                    contador += 1;
                }
            }
        }
        System.out.println("O número total de três digitos é: " + contador);
    }

}
