package PreParcial;

public class Donec extends Cras {
    @Override
    public String mauris() {
        return super.mauris()
                + " " + "mauris";
    }
    public String quam() {
        return "quam" + " " + this.lorem();
    }
}

