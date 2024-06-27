public class Herencia {
    public static void main(String[] args) {
        Gato gato =new Gato();
        gato.setColor("Jau");
        gato.maullar();

        Leon leon = new Leon();
        leon.setColor("Leon");
        leon.rugir();
        leon.dormir();
    }
}
