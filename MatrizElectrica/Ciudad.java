package MatrizElectrica;

import java.util.HashSet;

public class Ciudad {
    private HashSet<Consumidor> consumidores = new HashSet<>();
    private HashSet<Central> centrales = new HashSet<>();
    private HashSet<Propietario> propietarios = new HashSet<>();
    public Ciudad(){

    }

    public void agregarConsumidor(Consumidor nuevoConsumidor){
        consumidores.add(nuevoConsumidor);
    }

    public void agregarCentral(Central nuevaCentral){
        centrales.add(nuevaCentral);
    }
    public int consumoTotal(){
        int consumoTotal=0;
        for (Consumidor cons: consumidores){
            consumoTotal+= cons.getConsumo();
        }

        return consumoTotal;
    }

    private int produccionTotal(){
        int produccionTotal=0;
        for (Central cent: centrales){
            produccionTotal+= cent.getCantEnegia();
        }

        return produccionTotal;
    }

    private int emisionTotal(){
        int emisionTotal=0;
        for (Central cent: centrales){
            emisionTotal+= cent.getEmision();
        }

        return emisionTotal;
    }

    public boolean esEficiente(){
      return emisionTotal()>82;
    }

    public boolean esContaminante(){
        return emisionTotal()>=70;
    }

    public HashSet<Propietario> propietarios(){
        return this.propietarios;
    }
}
