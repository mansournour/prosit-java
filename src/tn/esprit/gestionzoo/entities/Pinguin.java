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
    public float getSwimmingDepth() {
        return swimmingDepth;
    }

    public void setSwimmingDepth(float swimmingDepth) {
        this.swimmingDepth = swimmingDepth;
    }
    //la méthode doivent etre implimenter ici car elle est abstraite dans la classe super
    @Override
    public void swim(){
        System.out.println("swim de la classe PINGUIN");
    }

}
