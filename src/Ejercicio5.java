import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        /*int num[] = {10,2,1,30};
        int i;
        int temp;
        for(int j=0;j<num.length-1;j++){
            for(i = 0; i<num.length-1;i++){
                if(num[i]<num[i+1]){
                    temp = num[i];
                    num[i]=num[i+1];
                    num[i+1]=temp;
                }
            }
        }
        System.out.println(num[0] + " & " + num[num.length-1]);*/

        Scanner scanner = new Scanner(System.in);
        System.out.println("Escriba la palbra");
        String palabra = scanner.nextLine();

        for( int i = palabra.length()-1;i>=0;i--){
            System.out.println(palabra.charAt(i));
        }


    }
}
