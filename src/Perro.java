public class Perro {
    String raza;
    int edad;
    String color;

    public Perro(String raza){
        this.raza=raza;
    }

    public Perro(String raza, int edad, String color){
        this.raza=raza;
        this.edad=edad;
        this.color=color;
    }

    void caminar(){
        System.out.println("Caminando ...");
    }

    void ladrar(){
        System.out.println("Ladrando ...");
    }

    void saltar(){
        System.out.println("Saltando ...");
    }
}
