package tn.esprit.gestionzoo.entities;

public class Aquatique extends Animal {
    private String habitat ;

    public Aquatique(String family, boolean isMammal, int age, String name) {
        super(family, isMammal, age, name);
    }

    public Aquatique(String family, boolean isMammal, int age, String name, String habitat) {
        super(family, isMammal, age, name);
        this.habitat = habitat;
    }
    public void swim (){
        System.out.println("swim");
    }

}
