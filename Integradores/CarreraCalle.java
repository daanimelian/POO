package Integradores;

public class CarreraCalle extends Carrera{

    public CarreraCalle(String nombre, double distancia) {
        super(nombre, distancia, 10);
    }

    @Override
    public boolean inscribirCorredor(Corredor corredor) {
        boolean fueInscripto=false;
        if ((this.getDistanciaKm() > 10 && corredor.tieneCertificadoMed())|| this.getDistanciaKm() < 10) {
            super.inscribirCorredor(corredor);
            fueInscripto=true;
        }
        return fueInscripto;
    }

}
