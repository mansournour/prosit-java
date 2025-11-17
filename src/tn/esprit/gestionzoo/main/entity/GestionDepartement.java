package tn.esprit.gestionzoo.main.entity;

import java.io.Serializable;
import java.util.HashSet;
import java.util.TreeSet;

public class GestionDepartement implements IDepartement<Departement> {

    private HashSet<Departement> liste = new HashSet<>();

    @Override
    public void ajouterDepartement(Departement t) {
        liste.add(t);
    }

    @Override
    public boolean rechercherDepartement(String nom) {
        for (Departement d : liste) {
            if (d.getNom().equalsIgnoreCase(nom))
                return true;
        }
        return false;
    }

    @Override
    public boolean rechercherDepartement(Departement t) {
        return liste.contains(t);
    }

    @Override
    public void supprimerDepartement(Departement t) {
        liste.remove(t);
    }

    @Override
    public void displayDepartement() {
        for (Departement d : liste) {
            System.out.println(d);
        }
    }

    @Override
    public TreeSet<Departement> trierDepartementById() {
        return new TreeSet<>((d1, d2) -> d1.getId() - d2.getId());
    }
}
