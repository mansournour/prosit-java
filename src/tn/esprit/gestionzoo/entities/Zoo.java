package tn.esprit.gestionzoo.entities;

public class Zoo {
    private Animal[] animals;
    private String name;
    private String city;
    static final int nbrCages = 25;
    private int nbrAnimals;

    public Zoo(String name, String city, int nbrCages, int nbrAnimals) {
        this.animals = new Animal[nbrCages];
        this.name = name;
        this.city = city;
        this.nbrAnimals = 0;
    }

    public String displayZoo() {
        return "Zoo{" +
                "name='" + name + '\'' +
                ", city='" + city + '\'' +
                ", nbrCages=" + nbrCages +
                '}';
    }

    // instruction10
    public boolean isZooFull() {
        return nbrAnimals >= nbrCages;
    }

    public boolean AddAnimal(Animal animal) {
        if (!isZooFull()) {
            animals[nbrAnimals] = animal;
            nbrAnimals++;
            return true;
        }
        return false;
    }

    // instruction11
    public int searchAnimal(Animal animal) {
        for (int i = 0; i < nbrAnimals; i++) {
            if (animals[i].getName().equalsIgnoreCase(animal.getName())) {
                return i;
            }
        }
        return -1;
    }

    // instruction12
    public boolean AddAnimalSort(Animal animal) {
        if (nbrAnimals >= nbrCages) {
            return false;
        }
        for (int i = 0; i < nbrAnimals; i++) {
            if (animals[i].getName().equalsIgnoreCase(animal.getName())) {
                return false;
            }
        }
        animals[nbrAnimals] = animal;
        nbrAnimals++;
        return true;
    }

    // instruction13
    public boolean removeAnimal(Animal animal) {
        for (int i = 0; i < nbrAnimals; i++) {
            if (animals[i].getName().equalsIgnoreCase(animal.getName())) {
                for (int j = i; j < nbrAnimals - 1; j++) {
                    animals[j] = animals[j + 1];
                }
                animals[nbrAnimals - 1] = null;
                nbrAnimals--;
                System.out.println("Removed animal " + animal.getName());
                return true;
            }
        }
        System.out.println(animal.getName() + " is not in the zoo");
        return false;
    }

    public static Zoo comparerZoo(Zoo z1, Zoo z2) {
        if (z1.nbrAnimals >= z2.nbrAnimals) {
            return z1;
        } else {
            return z2;
        }
    }
}
