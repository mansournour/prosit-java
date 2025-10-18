package tn.esprit.gestionzoo.entities;

public class Terrestre extends Animal {
private int nbrLrgs ;

    public Terrestre(String family, boolean isMammal, int age, String name, int nbrLrgs) {
        super(family, isMammal, age, name);
        this.nbrLrgs = nbrLrgs;
    }

    @Override
    public String toString() {
        return "Terrestre{" +
                "nbrLrgs=" + nbrLrgs +
                '}';
    }
}
