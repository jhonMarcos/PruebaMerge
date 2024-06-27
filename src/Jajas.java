import java.util.Scanner;

public class Jajas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un número impar mayor a 2: ");
        int numero = scanner.nextInt();

        if (numero % 2 == 0 || numero <= 2) {
            System.out.println("Por favor ingrese un número impar mayor a 2.");
        } else {
            // Parte superior del diamante
            for (int i = 1; i <= numero; i += 2) {
                for (int j = 0; j < i; j++) {
                    System.out.print("#");
                }
                System.out.println();
            }

            // Parte inferior del diamante
            for (int i = numero - 2; i > 0; i -= 2) {
                for (int j = 0; j < i; j++) {
                    System.out.print("#");
                }
                System.out.println();
            }
        }

        scanner.close();
    }
}
