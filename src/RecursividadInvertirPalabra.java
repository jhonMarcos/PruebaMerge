public class RecursividadInvertirPalabra {

    public static String pal (String palabra){
        String cosa;
        if(palabra.isEmpty()  || palabra.length()==1){
            return palabra;
        }
        return pal(palabra.substring(1)) + palabra.charAt(0);
    }

    public static void main(String[] args) {
        String palabra = "Jhon Marcos Soto";
        System.out.println(pal(palabra));
    }
}
