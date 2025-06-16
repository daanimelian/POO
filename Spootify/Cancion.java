package Spootify;

import java.util.HashSet;

public class Cancion {
    private String artista;
    private String titulo;
    private String id;
    private int reproducciones;
    private int likes;
    private HashSet<Usuario> usuarios = new HashSet<>();

    public Cancion(String artista, String titulo, String id) {
        this.artista = artista;
        this.titulo = titulo;
        this.id = id;
        this.reproducciones = 0;
        this.likes = 0;
    }
    public String getArtista() {
        return artista;
    }
    public String getTitulo() {
        return titulo;
    }
    public String getId() {
        return id;
    }
    public int getReproducciones() {
        return reproducciones;
    }
    public int getLikes() {
        return likes;
    }

    public void sumarReproducciones(){
        this.reproducciones++;
    }

    public void sumarLikes(){
        this.likes++;
    }

    public void addUsuario(Usuario u) {
        usuarios.add(u);
    }

    public HashSet<Usuario> getUsuarios() {
        return usuarios;
    }

}
