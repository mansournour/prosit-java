package tn.esprit.gestionzoo.entities;

public class Aquatic implements Carnivore<Food> {
    @Override
    public void eatMeat(Food meat) {
        if(meat == Food.MEAT || meat == Food.BOTH) {
            System.out.println("Aquatic animal is eating meat.");
        } else {
            System.out.println("Aquatic animal does not eat plants.");
        }
    }
}