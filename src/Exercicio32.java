public class Exercicio32 {
    public static void main(String[] args) {
        double x = 8;
        double y = 9;
        double z = 7;
        double a = 4;
        double b = 5;
        double c = 6;
        double media1 = (x + y + z) / 3;
        double media2 = (a + b + c) / 3;
        System.out.println("A primeira média é: " + media1);
        System.out.println("A segunda média é: " + media2);
        double somaDasMedias = media1 + media2;
        System.out.println("A soma das médias é: " + somaDasMedias);
        double mediaDasMedias = (media1 + media2) / 2;
        System.out.println("A média das médias é: " + mediaDasMedias);

    }
}
