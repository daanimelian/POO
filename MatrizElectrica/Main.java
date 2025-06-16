package MatrizElectrica;

public class Main {
    public static void main(String[] args) {
                // Propietarios
                Propietario p1 = new Propietario(2012345678, "YPF Energía");
                Propietario p2 = new Propietario(278765432, "GenWind SA");

                // Centrales
                ReactorNuclear rn = new ReactorNuclear(150);
                CentralNuclear nuclear = new CentralNuclear(rn, 300, p1); // capacidad 300
                nuclear.agregarReactor(new ReactorNuclear(92)); // Producción 237, Emisión 82

                ParqueEolico eolica = new ParqueEolico(1,200, p2); // capacidad 200
                eolica.incrementarGeneradores(); // +1 → 26
                eolica.incrementarGeneradores(); // +1 → 39
                eolica.incrementarGeneradores(); // +1 → 52

                // Consumidores
                Consumidor c1 = new Consumidor("UADE", 32);
                Consumidor c2 = new Consumidor("Empresa X", 110);
                Consumidor c3 = new Consumidor("Hospital", 75);

                // Ciudad
                Ciudad ciudad = new Ciudad();
                ciudad.agregarCentral(nuclear);
                ciudad.agregarCentral(eolica);

                ciudad.agregarConsumidor(c1);
                ciudad.agregarConsumidor(c2);
                ciudad.agregarConsumidor(c3);


                // Pruebas
                System.out.println("Consumo total: " + ciudad.getConsumoTotal()); // 217
                System.out.println("Producción total: " + ciudad.getProduccionTotal()); // 237 + 52 = 289
                System.out.println("¿Es sustentable?: " + ciudad.esSustentable()); // true
                System.out.println("¿Es eficiente?: " + ciudad.esEficiente()); // true
                System.out.println("¿Es potencialmente peligrosa?: " + ciudad.esPotencialmentePeligrosa()); // false
                System.out.println("Centrales contaminantes: ");
                for (Central c : ciudad.getCentralesContaminantes()) {
                    System.out.println(" - " + c.getClass().getSimpleName() + " | Emisión: " + c.getEmision());
                }

                System.out.println("Propietarios en la ciudad: ");
                for (Propietario p : ciudad.getPropietarios()) {
                    System.out.println(" - " + p.getNombre() + " (" + p.getCuit() + ")");
                }
            }
        }



