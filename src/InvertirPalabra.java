import java.util.Scanner;

public class InvertirPalabra {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingres una frase");
        String frase = scanner.nextLine();
        for(int i = frase.length()-1;i>=0;i--) {
            System.out.println(frase.charAt(i));
        }



    }
}
