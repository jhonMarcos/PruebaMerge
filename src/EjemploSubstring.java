public class EjemploSubstring {
    public static void main(String[] args) {
        String nombre = "Jhon marcos soto ";

        int pos;
        String a,b;
        b=nombre;
        pos = b.indexOf(" ");

        while (pos > 0) {
            a = b.substring(0, pos);
            b = b.substring(pos + 1);
            pos = b.indexOf(" ");
            System.out.println(a);
        }

    }
}
