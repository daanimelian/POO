public class Documento {

    public int getCant_hojas() {
        return cant_hojas;
    }

    public int getCant_magenta() {
        return cant_magenta;
    }

    public int getCant_amarillo() {
        return cant_amarillo;
    }

    public int getCant_cian() {
        return cant_cian;
    }

    private int cant_hojas;
    private int cant_magenta;
    private int cant_amarillo;
    private int cant_cian;

    public boolean isFue_impreso() {
        return fue_impreso;
    }

    public void setFue_impreso(boolean fue_impreso) {
        this.fue_impreso = fue_impreso;
    }

    private boolean fue_impreso = false;

    public Documento(int hojas, int amarillo, int cian, int magenta){
        cant_hojas=hojas;
        cant_amarillo=amarillo;
        cant_cian=cian;
        cant_magenta=magenta;
    }


}
