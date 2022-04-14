import java.util.Scanner;

public class AreaHexagono {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        double area;
        System.out.println("Qual o valor do comprimento?");
        double s = leitor.nextDouble();
       area = (6 * Math.pow(s, 2))/(4*Math.tan(Math.PI/6));
       System.out.println("A área do hexágono é: " + area);
       leitor.close();
    }
    
}
