package EjercicioIntegrador;
import java.util.HashSet;

public class Hamburguesa {
    private HashSet<Ingrediente> ingredientes = new HashSet<>();
    private double precio;
    private Medallon medallon;
    private Pan pan;
    int cantMedallones = 0;
    int cantIngredientes = 0;

    public Hamburguesa(Medallon tipoMedallon, Pan tipoPan){
        this.medallon = tipoMedallon;
        this.pan = tipoPan;
    }

    public void agregarExtra(Ingrediente ingExtra) {
        this.cantMedallones();
        this.cantIngredientes();
        if (cantMedallones < cantIngredientes) {
            System.out.println("No se puede agregar el ingrediente extra. Necesitas agregar primero un medallon.");
        } else {
            this.ingredientes.add(ingExtra);
            this.cantMedallones();
            this.cantIngredientes();

        }
    }

    public void cantMedallones(){
        for (Ingrediente ingrediente : ingredientes) {
            if (ingrediente instanceof Medallon){
                this.cantMedallones++;
            }
        }
    }

    public void cantIngredientes(){
        for (Ingrediente ingrediente : ingredientes) {
            if (! (ingrediente instanceof Medallon) && !(ingrediente instanceof Pan)){
                this.cantIngredientes++;
            }
        }
    }

}
