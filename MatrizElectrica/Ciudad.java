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
        propietarios.add(nuevaCentral.getPropietario());
    }
    public int getConsumoTotal(){
        int consumoTotal=0;
        for (Consumidor cons: consumidores){
            consumoTotal+= cons.getConsumo();
        }

        return consumoTotal;
    }

    public int getProduccionTotal(){
        int produccionTotal=0;
        for (Central cent: centrales){
            produccionTotal+= cent.getCantEnegia();
        }

        return produccionTotal;
    }

    public int emisionTotal(){
        int emisionTotal=0;
        for (Central cent: centrales){
            emisionTotal+= cent.getEmision();
        }

        return emisionTotal;
    }

    public boolean esEficiente(){
      return emisionTotal()<=82;
    }

    public boolean esContaminante(){
        return emisionTotal()>=70;
    }

    public boolean esPotencialmentePeligrosa(){
        int potencialmentePeligrosa=0;
        for(Central central: centrales){
            if (central.estaExigida()){
                potencialmentePeligrosa++;
            }

        }
        return potencialmentePeligrosa>0;
    }

    public boolean esSustentable(){
        return getConsumoTotal() < getProduccionTotal();
    }



    public HashSet<Propietario> getPropietarios(){
        return this.propietarios;
    }

    public HashSet<Central> getCentralesContaminantes() {
        HashSet<Central> centralesContaminantes = new HashSet<>();
        for(Central central: centrales){
            if (central.esContaminante()){
                centralesContaminantes.add(central);
            }
        }
        return centralesContaminantes;
    }
}
