package tn.esprit.gestionzoo.entities;
public class Terrestrial implements Omnivore<Food> {
    @Override
    public void eatMeat(Food meat) {
        if(meat == Food.MEAT || meat == Food.BOTH) {
            System.out.println("Terrestrial animal is eating meat.");
        }
    }

    @Override
    public void eatPlant(Food plant) {
        if(plant == Food.PLANT || plant == Food.BOTH) {
            System.out.println("Terrestrial animal is eating plants.");
        }
    }

    @Override
    public void eatPlantAndMeat(Food food) {
        if(food == Food.BOTH) {
            System.out.println("Terrestrial animal is eating both plants and meat.");
        }
    }
}