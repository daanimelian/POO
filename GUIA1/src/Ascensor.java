public class Ascensor {
    int pisoActual;
    int capacidad;

    public Ascensor(int capacidad) {
        this.capacidad = capacidad;
        this.pisoActual = 0;
    }

    public void subir(int pisos) {
        pisoActual += pisos;
        System.out.println("Ascensor subió al piso " + pisoActual);
    }

    public void bajar(int pisos) {
        pisoActual -= pisos;
        System.out.println("Ascensor bajó al piso " + pisoActual);
    }
}

