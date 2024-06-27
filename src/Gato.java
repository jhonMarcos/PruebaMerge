public class Gato extends Felino{

    public int tipoPelaje = 2;

    public void maullar() {
        System.out.println(getColor()+" está maullando.");
        System.out.println("El tipo de pelaje es " + tipoPelaje);
        System.out.println("El tipo de pelaje es " + this.tipoPelaje);
        System.out.println("El tipo de pelaje es " + super.tipoPelaje);
    }
}
