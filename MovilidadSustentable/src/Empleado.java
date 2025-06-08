package MovilidadSustentable.src;

public class Empleado {
    private String nombre;
    private Movilidad movilidad;

    public Empleado(String nombre, Movilidad movilidad) {
        this.nombre = nombre;
        this.movilidad = movilidad;
    }

    public String getNombre() {
        return nombre;
    }
    public Movilidad getMovilidad() {
        return movilidad;
    }
    public void cambiarMovilidad(Movilidad movilidad) {
        this.movilidad = movilidad;
    }

    public void mostrarPremio(){
        System.out.println(this.nombre + " recibira " + this.movilidad.obtenerPremio());
    }
}
