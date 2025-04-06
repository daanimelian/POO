public class Bicicleta2 {
    String color;
    int velocidad;

    public Bicicleta2(String color) {
        this.color = color;
        this.velocidad = 0;
    }

    public void pedalear() {
        velocidad += 5;
        System.out.println("Velocidad actual: " + velocidad + " km/h");
    }

    public void frenar() {
        velocidad = 0;
        System.out.println("La bicicleta se detuvo.");
    }
}

