package tn.esprit.gestionzoo.entities;
//classe devient abstraite car elle va contenir une méthode abstraite
//tous les classe qui ont éte herité par cette classe doivent rédefinir la methode abstraite
public abstract class Aquatique extends Animal {
    private String habitat ;

    public Aquatique(String family, boolean isMammal, int age, String name) {
        super(family, isMammal, age, name);
    }

    public Aquatique(String family, boolean isMammal, int age, String name, String habitat) {
        super(family, isMammal, age, name);
        this.habitat = habitat;
    }

  //  public void swim (){
  //      System.out.println("swim");
  //  }
//méthode abstraite =pas de corps
// abstract pour obliger les classes fille de refinire le methodes
//dans la classe fille de cette classe je dois ajouter @override
    public abstract void swim();
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        Aquatique other = (Aquatique) obj;
        return this.getAge() == other.getAge() &&
                this.getName().equalsIgnoreCase(other.getName()) &&
                ((this.habitat == null && other.habitat == null) ||
                        (this.habitat != null && this.habitat.equalsIgnoreCase(other.habitat)));
    }
}