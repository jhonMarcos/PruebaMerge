import java.util.Scanner;

public class EjericioEquis {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa cantidad");
        int num = scanner.nextInt();

        for (int i = 0; i < num;i++){
            for(int j = 0; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = num; i > 0;i--){
            for(int j = 1; j<i; j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
