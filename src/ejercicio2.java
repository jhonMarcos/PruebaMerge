import java.util.Scanner;

public class ejercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa numero impar mayor a 2");
        int numero = scanner.nextInt();
        if (numero % 2 == 0 || numero <= 2){
            System.out.println("El numero escogido es incorrecto");
        }
        else{
            for(int i = 0; i< numero; i++){

                for (int j = 0; j<=i;j++){
                    System.out.print("*");
                }
                System.out.println();
            }
            for(int i = numero; i>0; i--){

                for (int j = 1; j<i;j++){
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }
}
