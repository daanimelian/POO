package Integradores;

public class Main {
    public static void main(String[] args) {
        // Crear corredores
        Corredor paul = new Corredor("Paul");
        Corredor monica = new Corredor("Monica");


        // Crear carreras
        Carrera calle10k = new CarreraCalle("Carrera Maya", 10);
        Carrera trailRun = new CarreraTrail("Patagonia Run", 45, 2500, 5);
        Carrera recreativa5k = new CarreraRecreativa("Corré por los niños", 5);

        // Inscribir corredores
        System.out.println("== Inscripción ==");
        System.out.println("Paul en calle10k: " + calle10k.inscribirCorredor(paul));
        System.out.println("Paul en trailRun: " + trailRun.inscribirCorredor(paul));
        System.out.println("Monica en recreativa5k: " + recreativa5k.inscribirCorredor(monica));
        System.out.println("Monica en trailRun: " + trailRun.inscribirCorredor(monica));

        // largo carreras
        calle10k.largada();
        trailRun.largada();
        recreativa5k.largada();

        // Mostrar resultados
        System.out.println("\n== Resultados ==");
        System.out.println("Paul - carreras: " + paul.getCantCarreras() +
                ", puntos: " + paul.getPuntos() +
                ", distancia máx: " + paul.getMayorDistancia());

        System.out.println("Monica - carreras: " + monica.getCantCarreras() +
                ", puntos: " + monica.getPuntos() +
                ", distancia máx: " + monica.getMayorDistancia());

        // Mostrar inscriptos
        System.out.println("\n== Inscriptos en Patagonia Run ==");
        for (Corredor c : trailRun.getListaCorredores()) {
            System.out.println(c.getNombreCorredor());
        }

        // Sponsor
        Sponsor saucony = new Sponsor("Saucony");

        try {
            saucony.agregarPatrocinado(trailRun);   // ¿tiene desnivel suficiente o corredores con >=5 puntos?
            saucony.agregarPatrocinado(calle10k);   // probablemente no cumple (menos de 100 inscriptos)
            saucony.agregarPatrocinado(monica);     // probablemente no cumple (solo 2 carreras)
            saucony.agregarPatrocinado(paul);       // probablemente no cumple (solo 2 carreras)
            saucony.agregarPatrocinado(recreativa5k); // nunca se puede
        } catch (NoPatrocinableException e) {
            System.out.println("❌ " + e.getMessage());
        }

        // Mostrar cantidad
        System.out.println("\n== Patrocinados por Saucony ==");
        saucony.mostrarPatrocinados();
        System.out.println("Total patrocinados: " + saucony.cantidadPatrocinada());
    }
}
