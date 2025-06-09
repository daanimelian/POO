package Integradores;

import java.util.HashSet;

public class Sponsor {
    private String nombre;
    private HashSet<Sponsorable>  patrocinados = HashSet.newHashSet(1000);

    public Sponsor(String nombre) {
        this.nombre = nombre;
    }
    public String getNombre() {
        return nombre;
    }

    public void agregarPatrocinado(Sponsorable sponsorable) throws NoPatrocinableException {
        if(sponsorable.cumplisRequisitosDeSponsor()){
            patrocinados.add(sponsorable);
        }
        else {
            throw new NoPatrocinableException("No se puede patrocinar: no cumple los requisitos.");
        }
    }
    public int cantidadPatrocinada() {
        return patrocinados.size();
    }

    public void mostrarPatrocinados() {
        System.out.println("Elementos patrocinados:");
        for (Sponsorable p : patrocinados) {
            System.out.println(p.getNombre());
        }
    }
}
