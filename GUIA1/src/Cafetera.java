public class Cafetera {
    int capacidadMaxima;
    int cantidadActual;

    public Cafetera(int capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
        this.cantidadActual = 0;
    }

    public void llenar() {
        cantidadActual = capacidadMaxima;
        System.out.println("Cafetera llena.");
    }

    public void servirTaza(int cantidad) {
        if (cantidad <= cantidadActual) {
            cantidadActual -= cantidad;
            System.out.println("Se sirvió una taza de " + cantidad + "ml.");
        } else {
            System.out.println("No hay suficiente café.");
        }
    }
}
