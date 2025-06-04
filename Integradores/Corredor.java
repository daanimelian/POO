package Integradores;

public class Corredor {
    private String nombreCorredor;
    private int cantCarreras;
    private double mayorDistancia;
    private boolean certMedico = false;
    private int puntosTotales;

    public Corredor(String nombre){
        nombreCorredor = nombre;
        cantCarreras=0;
        mayorDistancia=0;
    }
    public void sumarCarrera(){
        this.cantCarreras++;
    }

    public void actMayorDistancia(Carrera carrera){
        if(carrera.getDistanciaKm() > this.mayorDistancia){
            this.mayorDistancia= carrera.getDistanciaKm();
        }
    }

    public String getNombreCorredor(){
        return this.nombreCorredor;
    }

    public boolean tieneCertificadoMed(){
        return this.certMedico;
    }

    public void cargarCertMed(){
        this.certMedico = true;
    }



    public void anotateEn(Carrera carrera){
        carrera.inscribirCorredor(this);
    }

    public void setPuntos(){

    }


}
