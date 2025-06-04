package Integradores;
import java.util.HashSet;

public class Carrera {
    private String nombreCarrera;
    private double distanciaKm;
    private HashSet<Corredor> listaCorredores= HashSet.newHashSet(1000);
    private boolean estaVigente=true;
    private int puntosQueOtorga=0;

    public Carrera(String nombre, double distancia, int puntos){
        this.nombreCarrera = nombre;
        this.distanciaKm= distancia;
        this.puntosQueOtorga = puntos;
    }

    public double getDistanciaKm(){
        return this.distanciaKm;
    }
    public void anotarCorredor(Corredor corredor){
        this.listaCorredores.add(corredor);
    }

    public boolean fueCorrida(){
        return this.estaVigente;
    }

    public void largada(){
        this.estaVigente=false;

    }

    public HashSet<Corredor> getListaCorredores(){
        return this.listaCorredores;
    }

    public boolean inscribirCorredor(Corredor corredor){
        return false;
    }

    public int getPuntosQueOtorga() {
        return puntosQueOtorga;
    }
}
