package MatrizElectrica;

public class Propietario {
    long cuit;
    String nombre;

    public Propietario(long cuit, String nombre){
        this.cuit = cuit;
        this.nombre = nombre;
    }

    public long getCuit() {
        return cuit;
    }

    public String getNombre() {
        return nombre;
    }



}
