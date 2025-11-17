package tn.esprit.gestionzoo.main.entity;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SocieteArrayList implements IGestion<Employe> {

    private List<Employe>  societe;
//je dois l'initialiserr dans le constructeur
    public SocieteArrayList() {
        this.societe = new ArrayList<>();
    }
    @Override
    public void ajouterEmploye(Employe e) {
       this.societe.add(e);
        System.out.println(" Employé ajouté : " + e.getNom());
    }

    @Override
    public boolean rechercherEmploye(String nom) {
        for (Employe e : societe) {
            if (e.getNom().equalsIgnoreCase(nom)) {
                System.out.println(" Employé trouvé : " + e);
                return true;
            }
        }
        System.out.println("Aucun employé trouvé avec le nom : " + nom);
        return false;
    }

    @Override
    public boolean rechercherEmploye(Employe e) {
        boolean existe = societe.contains(e);
        if (existe)
            System.out.println("Employé trouvé : " + e);
        else
            System.out.println(" Employé non trouvé : " + e);
        return existe;
    }

    @Override
    public void supprimerEmploye(Employe e) {
        if (societe.remove(e)) {
            System.out.println(" Employé supprimé : " + e);
        } else {
            System.out.println("Impossible de supprimer : employé introuvable !");
        }
    }

    @Override
    public void displayEmploye() {
        if (societe.isEmpty()) {
            System.out.println(" Aucun employé à afficher !");
        } else {
            System.out.println("📋 Liste des employés :");
            for (Employe e : societe) {
                System.out.println(e);
            }
        }
    }
//lezem employee doit implementer comparabole
    @Override
    public void trierEmployeParId() {
        Collections.sort(societe, Comparator.comparingInt(Employe::getId));
        System.out.println("Liste triée par identifiant !");
    }

    @Override
    public void trierEmployeParNomDépartementEtGrade() {
        Collections.sort(societe, Comparator
                .comparing(Employe::getNom)
                .thenComparing(Employe::getNomDepartement)
                .thenComparingInt(Employe::getGrade));
        System.out.println(" Liste triée par Nom, Département et Grade !");
    }
}
