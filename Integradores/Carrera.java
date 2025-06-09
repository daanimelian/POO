package Integradores;
import java.util.HashSet;

public class Carrera implements Sponsorable {
    private String nombreCarrera;
    private int distanciaKm;
    private HashSet<Corredor> listaCorredores= HashSet.newHashSet(1000);
    private boolean estaVigente=true;

    public Carrera(String nombre, int distancia){
        this.nombreCarrera = nombre;
        this.distanciaKm= distancia;
    }

    public int getDistanciaKm(){
        return this.distanciaKm;
    }

    public boolean fueCorrida(){
        return this.estaVigente;
    }

    public void largada(){
        this.estaVigente=false;
        this.darPuntosYDistancia();


    }

    public HashSet<Corredor> getListaCorredores(){
        return this.listaCorredores;
    }

    public boolean inscribirCorredor(Corredor corredor){
        this.listaCorredores.add(corredor);
        return true;
    }

    public int puntosQueOtorga(){
        return 0;
    }

    public void darPuntosYDistancia(){
        for(Corredor corredor: getListaCorredores()){
                corredor.setPuntos(this.puntosQueOtorga());
                corredor.actMayorDistancia(this);
                corredor.sumarCarrera();
            }
    }

    @Override
    public boolean cumplisRequisitosDeSponsor() {
        return false;
    }

    @Override
    public String getNombre() {
        return this.nombreCarrera;
    }
}
