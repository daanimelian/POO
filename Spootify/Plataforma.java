package Spootify;
import java.util.HashSet;
import java.util.Optional;
import java.util.stream.Stream;

public class Plataforma {
    private HashSet<Cancion> canciones = new HashSet<>();

    public Plataforma() {

    }

    public void addCancion(Cancion c) {
        canciones.add(c);
    }

    public void reproducirCancion(Cancion c, Usuario usuario) {
        if (canciones.contains(c)) {
            c.sumarReproducciones();
            c.addUsuario(usuario);
        }
        else{
            throw new IllegalArgumentException("No se puede reproducir el cancion ya que no se encuentra en la plataforma. ");
        }

    }

    public void darLikeACancion(Cancion c, Usuario usuario) {
        if (canciones.contains(c)) {
            if(c.getUsuarios().contains(usuario)) {
                c.sumarLikes();
            }
            else{
                throw new IllegalArgumentException("No se puede dar like a la cancion ya que el usuario no la escucho. ");
            }
        }
        else{
            throw new MyException("No se puede dar like ya que la cancion no existe en la plataforma");

        }
    }

    public HashSet<Cancion> getCancionesPorArtista(String artista) {
        HashSet<Cancion> cancionesPorArtista = new HashSet<>();
        for (Cancion c : canciones) {
            if (c.getArtista().toUpperCase().equals(artista.toUpperCase())) {
                cancionesPorArtista.add(c);

            }
        }
        return cancionesPorArtista;
    }

    public Cancion getCancion(String id) {
        Optional<Cancion> result = canciones.stream().filter(c -> c.getId().equals(id.toUpperCase())).findFirst();

        if (result.isPresent()) {
            return result.get();
        }
        else{
            throw new MyException("La cancion no existe en la plataforma. ");
        }

    }


    public Cancion getCancionMasReproducida(){
        int reproduccionesMax = 0;
        Cancion maxCancion = null;
        for (Cancion c : canciones) {
            if (c.getReproducciones() > reproduccionesMax) {
                reproduccionesMax = c.getReproducciones();
                maxCancion = c;
            }
        }
        return getCancion(maxCancion.getId());
    }

    public HashSet<String> artistas(){
        HashSet<String> artistas = new HashSet<>();
        for (Cancion c : canciones) {
            artistas.add(c.getArtista());
        }
        return artistas;
    }

    public boolean esUnExito(){
        return canciones.stream().allMatch((c) -> c.getReproducciones() > 0);
    }

    public HashSet<Cancion> hits(){
        HashSet<Cancion> hits = new HashSet<>();
        for (Cancion c : canciones) {
            if ((c.getReproducciones() > 1000) && (c.getReproducciones() * 0.8 >= c.getLikes())) {
                hits.add(c);
            }
        }
        return hits;
    }
}
