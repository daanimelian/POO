package MatrizElectrica;

public class ParqueEolico extends Central{
    int generadores;

    public ParqueEolico(int cantGeneradores, int capacidadMaxima, Propietario propietario){
        this.generadores = cantGeneradores;
        super.capacidadMaxima= capacidadMaxima;
        super.propietario = propietario;

    }


    @Override
    public int getCantEnegia() {
        return generadores*13;
    }

    @Override
    public int getEmision() {
        return 0;
    }

    public void incrementarGeneradores() {
        generadores++;
    }
}
