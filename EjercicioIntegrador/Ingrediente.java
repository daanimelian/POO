package EjercicioIntegrador;
public class Ingrediente {

    String tipo;
    double precio;

    public Ingrediente(){}

    public Ingrediente(String nombre, double precio){
        this.tipo = nombre;
        this.precio = precio;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

}
