import java.util.Arrays;

public class Zoo {
    Animal[] animals;
    String name;
    String city;
 static final   int nbrCages =25;
    int nbrAnimals;


    public Zoo(String name, String city, int nbrCages, int nbrAnimals) {
        //l'initialisation se faite dans le constructeur
        this.animals = new Animal[nbrCages];
        this.name = name;
        this.city = city;
        this.nbrAnimals = 0;
    }

    public String displayZoo() {
        return "Zoo{" +
                ", name='" + name + '\'' +
                ", city='" + city + '\'' +
                ", nbrCages=" + nbrCages +
                '}';
    }
    //instruction10

    public boolean AddAnimal(Animal animal) {
        animals[nbrAnimals] = animal;
        //ajouter l'animal au tb
        nbrAnimals++;
        //incrementer le compteur
        return true;
        // retourner vrai
    }

    public int searchAnimal(Animal animal) {
        animals[nbrAnimals] = animal;
        for (int i = 0; i < nbrAnimals; i++) {
            if (animals[i].name.equals(animal.name)) {
                return i;
            }

        }
        return -1;

    }

    //instruction12
    public boolean AddAnimalSort(Animal animal) {
        // Vérifier si le zoo est plein
        if (nbrAnimals >= nbrCages) {
            return false;
        }

        // Vérifier si l'animal existe déjà
        for (int i = 0; i < nbrAnimals; i++) {
            if (animals[i].name.equals(animal.name)) {
                return false;
            }
        }

        // Ajouter l'animal
        animals[nbrAnimals] = animal;
        nbrAnimals++;
        return true;
    }
//instruction13
    public boolean removeAnimal(Animal animal) {

        for (int i = 0; i < nbrAnimals; i++) {
            if (animals[i].name.equals(animal.name)) {
                for (int j = i; j < nbrAnimals - 1; j++) {
                    animals[j] = animals[j + 1];
                }

                animals[nbrAnimals - 1] = null; // dernière case vide
                nbrAnimals--;
                System.out.println("Removed animal " + animal.name);
                return true; // suppression réussie
            }
        }

        System.out.println(animal.name + " is not in the zoo");
        return false; // animal non trouvé
    }

    public boolean isZooFull() {
        return nbrAnimals >= nbrCages;
    }

    public static Zoo comparerZoo(Zoo z1, Zoo z2) {
        if (z1.nbrAnimals >= z2.nbrAnimals) {
            return z1;
        } else {
            return z2;
        }
    }

}