package tn.esprit.gestionzoo.main;


import tn.esprit.gestionzoo.main.entity.*;

import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {

        System.out.println("\n===================== TEST GESTION DEPARTEMENT =====================\n");

        GestionDepartement gd = new GestionDepartement();

        Departement d1 = new Departement(1, "Informatique", 40);
        Departement d2 = new Departement(2, "Finance", 25);
        Departement d3 = new Departement(3, "Marketing", 30);
        Departement d4 = new Departement(2, "Finance", 25); // Test equals + hashCode

        System.out.println("TEST AJOUT");
        gd.ajouterDepartement(d1);
        gd.ajouterDepartement(d2);
        gd.ajouterDepartement(d3);
        gd.ajouterDepartement(d4);
        System.out.println("\n AFFICHAGE DEPARTEMENTS");
        gd.displayDepartement();

        System.out.println("\n RECHERCHE PAR NOM (Finance)");
        System.out.println(gd.rechercherDepartement("Finance"));

        System.out.println("\n RECHERCHE PAR OBJET (d3)");
        System.out.println(gd.rechercherDepartement(d3));

        System.out.println("\n SUPPRESSION (d2)");
        gd.supprimerDepartement(d2);

        System.out.println("\n APRES SUPPRESSION");
        gd.displayDepartement();

        System.out.println("\n TRI PAR ID AVEC TREESET");
        TreeSet<Departement> tri = gd.trierDepartementById();

        for (Departement d : tri)
            System.out.println(d);


        System.out.println("\n===================== TEST SOCIETE ARRAYLIST =====================\n");

        SocieteArrayList societe = new SocieteArrayList();

        Employe e1 = new Employe(5, "Rania", "B.", "Informatique", 2) {};
        Employe e2 = new Employe(2, "Aymen", "H.", "Finance", 3) {};
        Employe e3 = new Employe(8, "Rania", "B.", "Marketing", 1) {}; // Même nom pour tester equals

        System.out.println(" AJOUT EMPLOYES");
        societe.ajouterEmploye(e1);
        societe.ajouterEmploye(e2);
        societe.ajouterEmploye(e3);

        System.out.println("\n AFFICHAGE EMPLOYES");
        societe.displayEmploye();

        System.out.println("\n RECHERCHE NOM 'Rania'");
        societe.rechercherEmploye("Rania");

        System.out.println("\n RECHERCHE PAR OBJET e1");
        societe.rechercherEmploye(e1);

        System.out.println("\n SUPPRESSION EMPLOYE e2");
        societe.supprimerEmploye(e2);

        System.out.println("\n LISTE APRES SUPPRESSION");
        societe.displayEmploye();

        System.out.println("\n TRI PAR ID");
        societe.trierEmployeParId();
        societe.displayEmploye();

        System.out.println("\n TRI PAR NOM + DEPARTEMENT + GRADE");
        societe.trierEmployeParNomDépartementEtGrade();
        societe.displayEmploye();

        AffectationHashMap af = new AffectationHashMap();



        af.ajouterEmployeDepartement(e1, d1);
        af.ajouterEmployeDepartement(e2, d2);
        af.ajouterEmployeDepartement(e3, d3);

        // TEST : ajouter le même employé → remplace l’ancien département
        af.ajouterEmployeDepartement(e1, d3);

        // AFFICHAGE COMPLET
        System.out.println("\n=== Employés et Départements ===");
        af.afficherEmployesEtDepartements();

        // SUPPRIMER EMPLOYE
        af.supprimerEmploye(e2);

        System.out.println("\n=== Après suppression e2 ===");
        af.afficherEmployesEtDepartements();

        // TEST RECHERCHE
        System.out.println("\nRecherche e1 : " + af.rechercherEmploye(e1));
        System.out.println("Recherche département RH : " + af.rechercherDepartement(d3));

        // TRI
        System.out.println("\n=== Map triée par ID Employé ===");
        System.out.println(af.trierMap());
    }
}
