public class Poo {
    public static void main(String[] args) {

        Persona jhon;
        System.out.println("###########################");
        jhon = new Persona("Pepido paes");
        Perro manchas = new Perro("Cheems");

        System.out.println("###########################");


        jhon.caminar();
        jhon.comer();
        jhon.setNombre("Gallina llina");
        System.out.println("Nombre : "+ jhon.getNombre());
        
        //manchas.raza = "Cocker";
        //manchas.ladrar();

        System.out.println("manchas.raza = " + manchas.raza);


    }
}
