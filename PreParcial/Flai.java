package PreParcial;

public class Flai extends Drus{
    public String power(){
        return "DrusPower" + "_" + super.power() + 2*lives();
    }

    public int lives(){
        return 5;
    }
    public String launch(){
        return this.power() + "_again" + this.lives();
    }

    public String bye(){
        return super.bye()+this.lives();
    }
}
