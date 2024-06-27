public class BurbujaIntento {
    public static void main(String[] args) {
        //nt numero[] = {1,2,3,5,9,10,12};
        int numero[] = {12,9,8,7,5,2,1};
        int temp;

        for(int i = 0;i<numero.length;i++){
            System.out.print(numero[i] + " ");
        }

        System.out.println();

        for(int i = 0; i<numero.length;i++){
            for (int j=i+1; j < numero.length;j++)
                if(numero[i]>numero[j])
                {
                    temp=numero[i];
                    numero[i]=numero[j];
                    numero[j]=temp;
                }

        }
        for(int i = 0;i<numero.length;i++){
            System.out.print(numero[i] + " ");
        }

    }
}
