package Integradores;

public class Corredor implements Sponsorable{

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
    void sumarCarrera(){
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

    void setPuntos(int puntos){
        this.puntosTotales+=puntos;
    }

    public int getPuntos(){
        return this.puntosTotales;
    }

    public int getCantCarreras() {
        return cantCarreras;
    }

    public double getMayorDistancia() {
        return mayorDistancia;
    }

    public boolean isCertMedico() {
        return certMedico;
    }

    public int getPuntosTotales() {
        return puntosTotales;
    }

    @Override
    public boolean cumplisRequisitosDeSponsor() {
        return this.getCantCarreras()>3;
    }

    @Override
    public String getNombre() {
        return this.nombreCorredor;
    }

}
