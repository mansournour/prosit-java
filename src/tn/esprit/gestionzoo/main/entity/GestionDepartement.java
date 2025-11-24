package tn.esprit.gestionzoo.main.entity;

import java.io.Serializable;
import java.util.Comparator;
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
        //najem nekhdemha bel
        for (Departement d : liste) {

            if (d.getNom().equalsIgnoreCase(nom))
                return true;
        }
        return false;
    }

    @Override
    public boolean rechercherDepartement(Departement t) {
        //tekhdem ken kif naamel redifintion lele equals
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
        //facons lamda expretion
        return new TreeSet<>((d1, d2) -> d1.getId() - d2.getId());


    }
   /* Comparator<Departement> idcretare =new Comparator<Departement>() {
        @Override
        public int compare(Departement o1, Departement o2) {
            return o1.getId() - o2.getId();
        }
    };*/
    //hedhy bech tkhalini naamel f tri set l tier
}
