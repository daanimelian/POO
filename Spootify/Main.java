package Spootify;

public class Main {
    public static void main(String[] args) {

        // Crear la plataforma
        Plataforma spootify = new Plataforma();

        // Crear canciones
        Cancion willow = new Cancion("Taylor Swift", "Willow", "EV01");
        Cancion pacifico = new Cancion("Los Piojos", "Pacifico", "CI02");
        Cancion thriller = new Cancion("Michael Jackson", "Thriller", "PO03");
        Cancion bohemian = new Cancion("Queen", "Bohemian Rhapsody", "RO04");
        Cancion despacito = new Cancion("Luis Fonsi", "Despacito", "LA05");

        // Agregar canciones a la plataforma
        spootify.addCancion(willow);
        spootify.addCancion(pacifico);
        spootify.addCancion(thriller);
        spootify.addCancion(bohemian);
        spootify.addCancion(despacito);

        // Crear usuarios
        Usuario usuario1 = new Usuario("Juan", 1);
        Usuario usuario2 = new Usuario("Maria", 2);

        // Reproducir canciones
        spootify.reproducirCancion(willow, usuario1);
        spootify.reproducirCancion(bohemian, usuario2);
        spootify.reproducirCancion(despacito, usuario1);
        spootify.reproducirCancion(despacito, usuario2);

        // Intentar dar "like"
        try {
            spootify.darLikeACancion(despacito, usuario1);
            spootify.darLikeACancion(bohemian, usuario2);
            spootify.darLikeACancion(willow, usuario2); // Este lanza error porque María no la reprodujo
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        // Mostrar información de una canción
        System.out.println("Reproducciones de 'Despacito': " + despacito.getReproducciones());
        System.out.println("Likes de 'Despacito': " + despacito.getLikes());
        System.out.println("Artista de 'Bohemian Rhapsody': " + bohemian.getArtista());


        // Consultas sobre la plataforma
        System.out.println("Todos los artistas en la plataforma: " + spootify.artistas());
        System.out.println("Canción más reproducida: " + spootify.getCancionMasReproducida().getTitulo());
        System.out.println("La plataforma es un éxito: " + spootify.esUnExito());
        System.out.println("Canciones HIT en la plataforma: " + spootify.hits());






    }
}
