package PreParcial;

public class Tostadora {
    public void tostar(Pan unPan) {
        unPan.tostar();
    }
    public Pan dameUnPanTostado() {
        Pan unPan = new Pan();
        unPan.tostar();
        return unPan;
    }
    public boolean decimeSiEstaTostado(Pan unPan) {
        return unPan.estaTostado();
    }
    public Pan cambialoPorUnoTostado(Pan unPan) {
        return dameUnPanTostado();
    }
}
