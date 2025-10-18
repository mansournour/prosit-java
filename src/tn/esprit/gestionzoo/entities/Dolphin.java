package tn.esprit.gestionzoo.entities;

public class Dolphin extends Animal {

private float swimmingSpeed ;

    public Dolphin(String family, boolean isMammal, int age, String name, float swimmingSpeed) {
        super(family, isMammal, age, name);
        this.swimmingSpeed = swimmingSpeed;
    }

    @Override
    public String toString() {
        return "Dolphin{" +
                "swimmingSpeed=" + swimmingSpeed +
                '}';
    }

    public void swim(){
        System.out.println("swimdolphin");
    }
}
