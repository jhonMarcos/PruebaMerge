public class BurbujaMetodo {
    public static void main(String[] args) {
        int [] num={1,3,6,8,18,30};
        int i = 0;
        int temp=0;

        for (i = 0; i<num.length;i++){
            System.out.print(num[i] + " ");
        }
        System.out.println();

        i=0;
       if(num[i]<num[i+1]){
            temp= num[i];
            num[i]=num[i+1];
            num[i+1] = temp;
        }
        for (i = 0; i<num.length;i++){
            System.out.print(num[i] + " ");
        }
        System.out.println();


       /* for (int i = 0; i<num.length-1;i++){
            System.out.println("i : " + num[i]);
            System.out.println("i+1 : " + num[i+1]);
        }*/


    }
}
