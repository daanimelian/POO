/*SUPER llama al metodo padre e ignora el override*/

public class Impresora{

    private int cant_hojas;
    private Integer cian = 100;
    private Integer amarillo = 100;
    private Integer magenta = 100;

    public int getCant_hojas() {
        return cant_hojas;
    }

    public Integer getCian() {
        return cian;
    }

    public Integer getMagenta() {
        return magenta;
    }

    public Integer getAmarillo() {
        return amarillo;
    }

    public Impresora(Integer hojas){
        cant_hojas = hojas;
    }

    public  boolean puedeImprimir(Documento documento){
        boolean puede_imprimir;
        puede_imprimir = (documento.getCant_hojas() < cant_hojas) && (documento.getCant_amarillo() < amarillo) && (documento.getCant_cian() < cian) && (documento.getCant_magenta() < magenta);
        return puede_imprimir;
    }

    public void imprimir(Documento documento){
        cant_hojas -= documento.getCant_hojas();
        amarillo -= documento.getCant_amarillo();
        cian -= documento.getCant_cian();
        magenta -= documento.getCant_magenta();
        documento.setFue_impreso(true);
    }
}
