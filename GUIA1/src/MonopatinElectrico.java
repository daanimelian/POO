public class MonopatinElectrico {
    int bateria;
    int velocidad;

    public MonopatinElectrico() {
        bateria = 100;
        velocidad = 0;
    }

    public void acelerar() {
        if (bateria > 0) {
            velocidad += 10;
            bateria -= 5;
            System.out.println("Acelerando a " + velocidad + " km/h. Batería: " + bateria + "%");
        } else {
            System.out.println("Batería agotada.");
        }
    }

    public void recargar() {
        bateria = 100;
        System.out.println("Monopatín recargado al 100%.");
    }
}
