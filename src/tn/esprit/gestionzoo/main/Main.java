package tn.esprit.gestionzoo.main;

import tn.esprit.gestionzoo.entities.Aquatic;
import tn.esprit.gestionzoo.entities.Food;
import tn.esprit.gestionzoo.entities.Terrestrial;

/*
import tn.esprit.gestionzoo.entities.*;
import tn.esprit.gestionzoo.entities.ZooFullException;

import javax.swing.text.StyledEditorKit;

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

        // Ajout des animaux
      //  System.out.println("Ajout de a1 : " + myZoo.AddAnimal(a1));
      //  System.out.println("Ajout de a2 : " + myZoo.AddAnimal(a2));

        // Recherche d’un animal déjà ajouté
     //   System.out.println("Indice de a1 : " + myZoo.searchAnimal(a1));

        // Création d’un autre lion pour tester la recherche
      //  Animal a3 = new Animal("Félidé", true, 2, "lion");
     //   System.out.println("Indice de a3 : " + myZoo.searchAnimal(a3));
        //Teste instruction 21
        // apres l instruction 22  va donnée une erreur donc je dois passer les parametres

        //Dolphin d = new Dolphin("xxx",true,20 ,"nnn",302);
        Pinguin p = new Pinguin("Pingo", true, 20 ,"xxx","hhh",20);
        Terrestre t = new Terrestre("Lion", true ,20 ,"hh",12);


      //  Aquatique aq = new Aquatique("vvv",true,20 , "bb","hhh")7
        //System.out.println(d);
        System.out.println(p);
        System.out.println(t);
//instruction 26
        Zoo myzoo = new Zoo("Zoo de Tunis", "Tunis", 25, 0);
        //creation de animal aquatique
      //  Aquatique aq1 = new Aquatique("dauphin",true,22,"Flipper");
      //  myzoo.addAquaticAnimal(aq1);
        System.out.println("Aquatic ajouter au zoo");
        //27
        // Ajout d'animaux aquatiques
     //   myZoo.addAquaticAnimal(new Aquatique("Poisson", false, 2, "Goldy"));
      //  myZoo.addAquaticAnimal(new Aquatique("Dauphin", true, 5, "Flipper"));
      //  myZoo.addAquaticAnimal(new Aquatique("Requin", false, 7, "Jaws"));

        // Affichage de swim() pour tous
        try {
            // 🦁 Création d’un zoo
            Zoo myZoo = new Zoo("Zoo de Tunis", "Tunis", 3, 0);

            // 🐾 Création d’animaux valides
            Animal a1 = new Animal("Félidé", true, 3, "Lion");
            Animal a2 = new Animal("Canidé", false, 2, "Chien");

            myZoo.addAnimal(a1);
            myZoo.addAnimal(a2);

            // 🐍 Tentative avec âge négatif
            Animal a3 = new Animal("Reptile", false, -5, "Serpent"); // ⚠️ Devrait déclencher InvalidAgeException
            myZoo.addAnimal(a3);

        } catch (InvalidAgeException e) {
            System.out.println("⚠️ Erreur d’âge : " + e.getMessage());
        } catch (ZooFullException e) {
            System.out.println("⚠️ Zoo plein : " + e.getMessage());
        } finally {
            System.out.println("✅ Programme terminé !");
        }
    }
}
*/
// Main.java
public class Main {
    public static void main(String[] args) {
        Aquatic dolphin = new Aquatic();
        Terrestrial bear = new Terrestrial();

        // Tester les méthodes
        dolphin.eatMeat(Food.MEAT);  // doit afficher : Aquatic animal is eating meat.
        dolphin.eatMeat(Food.PLANT); // doit afficher : Aquatic animal does not eat plants.

        bear.eatMeat(Food.MEAT);     // Terrestrial animal is eating meat.
        bear.eatPlant(Food.PLANT);   // Terrestrial animal is eating plants.
        bear.eatPlantAndMeat(Food.BOTH); // Terrestrial animal is eating both plants and meat.
    }
}
