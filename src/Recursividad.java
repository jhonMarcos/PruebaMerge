public class Recursividad {

    public static int numero(int n){
        if(n==10){
         return n;
        }
        return numero(n+1)+n;
    }

    public static void main(String[] args) {
        int n = 1;
        System.out.println(numero(n));
    }
}
