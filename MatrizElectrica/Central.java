package MatrizElectrica;

abstract class Central {
    protected int capacidadMaxima;
    protected Propietario propietario;

    public abstract int getCantEnegia();
    public abstract int getEmision();

    public boolean estaExigida() {
        return getCantEnegia() >= capacidadMaxima;
    }

    public Propietario getPropietario() {
        return propietario;
    }
}

