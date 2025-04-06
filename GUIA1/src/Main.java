public class Main {
    public static void main(String[] args) {
        Gato p = new Gato("Banquetita", 3);
        p.ronronear();
        p.cumplirAnios();

        Ascensor a = new Ascensor(6);
        a.subir(3);
        a.bajar(1);

        Impresora i = new Impresora(10);
        i.encender();
        i.imprimir("BOCAAAAAAAAAAAAA");

        Cafetera c = new Cafetera(1000);
        c.llenar();
        c.servirTaza(250);

        Bicicleta2 b = new Bicicleta2("Roja");
        b.pedalear();
        b.frenar();

        MonopatinElectrico m = new MonopatinElectrico();
        m.acelerar();
        m.recargar();

        CuentaBancaria cuenta = new CuentaBancaria("Lucía", 5000);
        cuenta.depositar(1000);
        cuenta.retirar(2000);
    }
}
