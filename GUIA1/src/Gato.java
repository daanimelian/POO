public class Gato {
    String nombre;
    int edad;

    public Gato(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public void ronronear() {
        System.out.println(nombre + " está ronroneando.");
    }

    public void cumplirAnios() {
        edad++;
        System.out.println(nombre + " ahora tiene " + edad + " años.");
    }
}
