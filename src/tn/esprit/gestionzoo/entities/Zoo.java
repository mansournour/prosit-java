package tn.esprit.gestionzoo.entities;

public class Zoo {
    private Animal[] animals;
    private Aquatique[] aquaticAnimal;
    private String name;
    private String city;
    static final int nbrCages = 3;
    private int nbrAnimals;
    private int nbrAquaticAnimals =0;

    public Zoo(String name, String city, int nbrCages, int nbrAnimals) {
        this.animals = new Animal[nbrCages];
        this.aquaticAnimal = new Aquatique[10];
        this.name = name;
        this.city = city;
        this.nbrAnimals = 0;
    }

    public int getNbrAnimals() {
        return nbrAnimals;
    }

    public void setNbrAnimals(int nbrAnimals) {
        this.nbrAnimals = nbrAnimals;
    }

    public String displayZoo() {
        return "Zoo{" +
                "name='" + name + '\'' +
                ", city='" + city + '\'' +
                ", nbrCages=" + nbrCages +
                '}';
    }

    public Zoo() {
    }

    // instruction10
    public boolean isZooFull() {
        return nbrAnimals >= nbrCages;
    }
/*
    public boolean AddAnimal(Animal animal) {
        if (!isZooFull()) {
            animals[nbrAnimals] = animal;
            nbrAnimals++;
            return true;
        }
        return false;
    }
*/
    //instruction 32
    public void addAnimal(Animal animal) throws ZooFullException {
        if (nbrAnimals >= nbrCages) {
            throw new ZooFullException("La zoo esta vacia");
        }
        animals[nbrAnimals] = animal;
        nbrAnimals++;
        System.out.println("L'animal est ajouté avec succés !");
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
        }}
        //méthode pour ajouter un animal aquatique pour le zoo
        public void addAquaticAnimal(Aquatique aquatic)
        {
            if(nbrAquaticAnimals < aquaticAnimal.length){
                aquaticAnimal[nbrAquaticAnimals]=aquatic ;
                nbrAquaticAnimals++;
                System.out.println(aquatic.getName() +"ajouter au animals");
            }
            else {
                System.out.println("pas d'espace dans la zoo ");
            }
        }
        //27.afficher la méthode swim() de tous les animaux aquatiques

        public void showAllSwim () {
            for (int i = 0; i < nbrAquaticAnimals; i++) {
                aquaticAnimal[i].swim();
            }

        }
    // instruction 29
    public float maxPenguinSwimmingDepth () {
        float maxDepth = 0;
        for (int i = 0; i < nbrAquaticAnimals; i++) {
            if (aquaticAnimal[i] instanceof Pinguin) {
                Pinguin p = (Pinguin) aquaticAnimal[i];
                // on compare la profondeur
                if (p.getSwimmingDepth() > maxDepth) {
                    maxDepth = p.getSwimmingDepth();
                }
            }
        }
        return maxDepth;
    }

    //instruction30
    public void displayNumberOfAquaticsByType () {
        int countDolphins = 0;
        int countPenguins = 0;

        for (int i = 0; i < nbrAquaticAnimals; i++) {
            if (aquaticAnimal[i] instanceof Dolphin) {
                countDolphins++;
            } else if (aquaticAnimal[i] instanceof Pinguin) {
                countPenguins++;
            }
        }

        System.out.println("Nombre de dauphins : " + countDolphins);
        System.out.println("Nombre de pingouins : " + countPenguins);
    }}