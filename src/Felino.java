public class Felino {
    private boolean bTieneBigotes;
    private double peso;
    private double largo;
    private double ancho;

    private String color;

    public int tipoPelaje = 1;

    public Felino(){

    }

    public Felino(boolean bTieneBigotes, double peso, double largo, double ancho,String color) {
        this.bTieneBigotes = bTieneBigotes;
        this.peso = peso;
        this.largo = largo;
        this.ancho = ancho;
        this.color = color;
    }

    public boolean isbTieneBigotes() {
        return bTieneBigotes;
    }

    public void setbTieneBigotes(boolean bTieneBigotes) {
        this.bTieneBigotes = bTieneBigotes;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getLargo() {
        return largo;
    }

    public void setLargo(double largo) {
        this.largo = largo;
    }

    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void dormir() {
        System.out.println(color + " está durmiendo."); }

    /*public void rugir() {
        System.out.println(color + " está rugiendo."); }*/

    /*public void maullar() {
        System.out.println(color + " está rugiendo."); }*/


}
