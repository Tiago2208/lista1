import java.util.Scanner;

public class ReverterString {
    public static void main(String[] args) {
        System.out.println("Qual String você deseja reverter?");
        Scanner leitor = new Scanner(System.in);
        String str = leitor.next();
        StringBuilder strb = new StringBuilder(str);
        str = strb.reverse().toString();
        System.out.println(str);
        leitor.close();
    }
    
}
