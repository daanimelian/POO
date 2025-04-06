public class Impresora {
    int hojasDisponibles;
    boolean encendida;

    public Impresora(int hojas) {
        this.hojasDisponibles = hojas;
        this.encendida = false;
    }

    public void encender() {
        encendida = true;
        System.out.println("Impresora encendida.");
    }

    public void imprimir(String texto) {
        if (encendida && hojasDisponibles > 0) {
            hojasDisponibles--;
            System.out.println("Imprimiendo: " + texto);
        } else {
            System.out.println("No se puede imprimir.");
        }
    }
}
