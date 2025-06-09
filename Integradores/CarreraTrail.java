package Integradores;

public class CarreraTrail extends Carrera{

    private int desnivel;
    private int cupoMaximo;

    public CarreraTrail(String nombre, int distancia, int desnivel, int cupoMaximo) {
        super(nombre, distancia);
        this.desnivel = desnivel;
        this.cupoMaximo = cupoMaximo;

    }
    public int getDesnivel() {
        return desnivel;
    }


    public int puntosQueOtorga(){
        int puntosDesnivel= desnivel/1000 ;
        int puntosPorDistancia = this.getDistanciaKm()/20;

        return puntosDesnivel + puntosPorDistancia;
    }

    public boolean inscribirCorredor(Corredor corredor){
        boolean fueInscripto=false;
        if(this.getListaCorredores().size() < cupoMaximo){
            this.getListaCorredores().add(corredor);
            fueInscripto=true;
        }
        return fueInscripto;
    }

    @Override
    public boolean cumplisRequisitosDeSponsor() {
        boolean cumples=false;
        if(this.getDesnivel() >= 2000){
            cumples=true;
        }
        else {
            for (Corredor corredor : this.getListaCorredores()) {
                if (corredor.getPuntosTotales() > 5) {
                    cumples = true;
                    break;
                }
            }
        }
        return cumples;
    }
}
