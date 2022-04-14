import java.util.Scanner;

public class Exercicio22 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite quantos segundos você deseja converter: ");
        int tempoTotal = leitor.nextInt();

        int horas;
        int minutos;
        int segundos;

        minutos = (int) (tempoTotal / 60);
        segundos = tempoTotal % 60;
        horas = (int) minutos / 60;
        minutos = minutos % 60;


        System.out.println(horas + ":" + minutos + ":" + segundos);
        leitor.close();

    }
    
}
