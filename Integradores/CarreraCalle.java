package Integradores;
public class CarreraCalle extends Carrera{
    public CarreraCalle(String nombre, int distancia) {
        super(nombre, distancia);
    }

    @Override
    public boolean inscribirCorredor(Corredor corredor) {
        boolean fueInscripto=false;
        if (this.getDistanciaKm() <= 10 || corredor.tieneCertificadoMed()) {
            super.inscribirCorredor(corredor);
            fueInscripto=true;
        }
        return fueInscripto;
    }

    public int puntosQueOtorga(){
        return 10;
    }

    public void darPuntosYDistancia(){
        for(Corredor corredor: getListaCorredores()){
            if(corredor.getPuntos()<10){
                corredor.setPuntos(this.puntosQueOtorga());
            }
            corredor.actMayorDistancia(this);
            corredor.sumarCarrera();
        }

    }

    @Override
    public boolean cumplisRequisitosDeSponsor() {
        return this.getListaCorredores().size() > 100;
    }
}
