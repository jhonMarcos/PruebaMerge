public class Persona {
    private String nombre;
    private int anioNacimiento;
    private String pais;
    private String tipoDocumento;
    private String numDocumento;
    private Corazon cor;

    public Persona(){

        System.out.println("Ejecutado desde constructor");
    }

    public Persona(String nombre){

        this.nombre=nombre;
    }

    public Persona(String nombre, int anioNacimiento, String pais, String tipoDocumento, String numDocumento, Corazon cor) {
        this.nombre = nombre;
        this.anioNacimiento = anioNacimiento;
        this.pais = pais;
        this.tipoDocumento = tipoDocumento;
        this.numDocumento = numDocumento;
        this.cor = cor;
    }

    void caminar(){
        System.out.println("Camiando ..");
    }
    void hablar(){
        System.out.println("Hablando ...");
    }
    void saltar(){
        System.out.println("Saltando ..");
    }

    void comer(){
        System.out.println("Comiendo ...");
    }
    void respirar(){
        System.out.println("Respirando ...");
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getAnioNacimiento() {
        return anioNacimiento;
    }

    public void setAnioNacimiento(int anioNacimiento) {
        this.anioNacimiento = anioNacimiento;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        pais = pais;
    }

    public String getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(String tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    public String getNumDocumento() {
        return numDocumento;
    }

    public void setNumDocumento(String numDocumento) {
        this.numDocumento = numDocumento;
    }

    public Corazon getCor() {
        return cor;
    }

    public void setCor(Corazon cor) {
        this.cor = cor;
    }
}
