package tn.esprit.gestionzoo.entities;

public class Pinguin extends Aquatique{
private float swimmingDepth ;

    public Pinguin(String family, boolean isMammal, int age, String name, String habitat, float swimmingDepth) {
        super(family, isMammal, age, name, habitat);
        this.swimmingDepth = swimmingDepth;
    }

    @Override
    public String toString() {
        return "Pinguin{" +
                "swimmingDepth=" + swimmingDepth +
                '}';
    }
}
