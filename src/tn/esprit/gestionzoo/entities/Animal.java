package tn.esprit.gestionzoo.entities;

public class Animal {


    private String family ;

    private  String name ;
    private int age ;
    private boolean isMammal ;

    public String toString() {
        return "Animal{" +
                "family='" + family + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", isMammal=" + isMammal +
                '}';
    }
    public Animal(String family, boolean isMammal, int age, String name) throws InvalidAgeException {
        if (age < 0) {
            throw new InvalidAgeException("❌ Âge invalide : " + age + ". L'âge d'un animal ne peut pas être négatif !");
        }
        this.family = family;
        this.isMammal = isMammal;
        this.age = age;
        this.name = name;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.length() != 0){
            this.name = name;

        }
    }

    public String getFamily() {
        return family;
    }

    public void setFamily(String family) {
        this.family = family;
    }

    public boolean isMammal() {
        return isMammal;
    }

    public void setMammal(boolean mammal) {
        isMammal = mammal;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age >= 0) {
            this.age = age;

        }

    }
}
