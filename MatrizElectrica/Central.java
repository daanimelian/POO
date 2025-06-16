package MatrizElectrica;

abstract class Central {
    protected int capacidadMaxima;
    protected Propietario propietario;

    public abstract int getCantEnegia();
    public abstract int getEmision();

    public boolean estaExigida() {
        return getCantEnegia() >= capacidadMaxima;
    }
    public boolean esContaminante(){
        return getEmision() >= 70;
    }

    public Propietario getPropietario() {
        return propietario;
    }
}

