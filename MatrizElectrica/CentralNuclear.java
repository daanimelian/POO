package MatrizElectrica;
import java.util.HashSet;

public class CentralNuclear extends Central{
    HashSet<ReactorNuclear> reactores= new HashSet<>();


    public CentralNuclear(ReactorNuclear reactor, int capacidadMaxima, Propietario propietario){
      reactores.add(reactor);
      super.capacidadMaxima=capacidadMaxima;
      super.propietario = propietario;

    }

    @Override
    public int getCantEnegia() {
        int cantEnergia=0;
        for(ReactorNuclear reactor: reactores){
            cantEnergia += reactor.getAporte();
        }
        cantEnergia -= 5;
        return cantEnergia;
    }

    @Override
    public int getEmision() {
        return reactores.size()*41;
    }

    public void agregarReactor(ReactorNuclear reactorNuclear){
        if(reactores.size() >= 5){
            System.out.println("No podes agregar mas reactores");

        }
        else{
            reactores.add(reactorNuclear);
        }
    }
}
