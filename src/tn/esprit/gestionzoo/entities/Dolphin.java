package tn.esprit.gestionzoo.entities;

public class Dolphin extends Aquatique {

    private float swimmingSpeed;

    public Dolphin(String family, boolean isMammal, int age, String name, String habitat, float swimmingSpeed) {
        super(family, isMammal, age, name, habitat);
        this.swimmingSpeed = swimmingSpeed;
    }

    public float getSwimmingSpeed() {
        return swimmingSpeed;
    }

    public void setSwimmingSpeed(float swimmingSpeed) {
        this.swimmingSpeed = swimmingSpeed;
    }

    @Override
    public void swim() {
        System.out.println("Le dauphin " + getName() + " nage à une vitesse de " + swimmingSpeed + " km/h !");
    }
}
