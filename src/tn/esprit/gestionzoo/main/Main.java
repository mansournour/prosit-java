package tn.esprit.gestionzoo.main;

import tn.esprit.gestionzoo.entities.Animal;
import tn.esprit.gestionzoo.entities.Zoo;

public class Main {
    public static void main(String[] args) {
        //Zoo myZoo = new Zoo("myZoo","sfax",3 ,0) ;


//Animal a1 =new Animal("Félidé",true,3,"lion");
        // Animal a2 =new Animal("chien",false ,2,"chien");

        // myZoo.animals[0]=a1;
//System.out.println (myZoo.displayZoo() );
        //instruction10
//System.out.println (myZoo.AddAnimal(a1));
//System.out.println (myZoo.AddAnimal(a2));
//instruction11
        //  System.out.println(myZoo.searchAnimal(a1)); //pas un autr elion
        //   Animal a3 =new Animal("f" , true ,2,"lion");
        //  System.out.println (myZoo.searchAnimal(a3)); //retourne l'indice de la 1  er lion trouver va rester 0 donc
        // Création du zoo (on donne son nom, sa ville, et son nombre de cages)
        /// ///apres les getters and setters
            // Création du zoo
            Zoo myZoo = new Zoo("Zoo de Tunis", "Tunis", 25, 0);

            // Création des animaux
            Animal a1 = new Animal("Félidé", true, 3, "lion");
            Animal a2 = new Animal("Canidé", false, 2, "chien");

            // Ajout des animaux
            System.out.println("Ajout de a1 : " + myZoo.AddAnimal(a1));
            System.out.println("Ajout de a2 : " + myZoo.AddAnimal(a2));

            // Recherche d’un animal déjà ajouté
            System.out.println("Indice de a1 : " + myZoo.searchAnimal(a1));

            // Création d’un autre lion pour tester la recherche
            Animal a3 = new Animal("Félidé", true, 2, "lion");
            System.out.println("Indice de a3 : " + myZoo.searchAnimal(a3));
        }

    }


