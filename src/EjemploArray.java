public class EjemploArray {
    public static void main(String[] args) {
        int num[] = {201,2,23,3,30,20,4,9,8};
        int mayor=0;
        for(int i =0;i<num.length-1;i++){
            for (int j=1; j<num.length-1; j++)
            {
                if (num[i]<num[j]){
                    mayor= num[i];
                }

            }

        }
        System.out.println("Valor = " + mayor);
    }
}
