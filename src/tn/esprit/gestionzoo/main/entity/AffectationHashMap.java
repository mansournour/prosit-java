package tn.esprit.gestionzoo.main.entity;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class AffectationHashMap  {
    //instruction1
    private HashMap <Employe ,Departement> map;
    public AffectationHashMap() {
        map = new HashMap<>();
    }
    //instruction2
    public void ajouterEmployeDepartement(Employe e, Departement d) {
        map.put(e, d);
    }
    //insctuction33
    public void afficherEmployesEtDepartements() {
        /*for (Employe e : map.keySet()) {
            System.out.println(e + " → " + map.get(e));
        }*/
        Set<Map.Entry<Employe, Departement>> entrySet = map.entrySet();
        for (Map.Entry<Employe, Departement> entry : entrySet) {
            System.out.println(entry.getKey()+":" + entry.getValue());
        }

    }
    public void supprimerEmploye(Employe e) {
       map.remove(e);
    }
    public void supprimerEmployeEtDepartement(Employe e, Departement d) {
        //avec condition et reutiliser la supprimer employe
      //map.remove(e, d);
    }
    public void afficherEmployes() {
        //yheb yaffichi employe
        for (Employe e : map.keySet()) {
            System.out.println(e);
        }
    }
    public void afficherDepartements() {
        for (Departement d : map.values()) {
            System.out.println(d);
        }
    }
    public boolean rechercherEmploye(Employe e) {
        return map.containsKey(e);
    }
    public boolean rechercherDepartement(Departement d) {
        return map.containsValue(d);
    }
    public TreeMap<Employe, Departement> trierMap() {
//treeset taamel trie selon clé
        //kif nhehb naamel trie selon autre critere lezem naamel comparteTo
        return new TreeMap<>(map); // TreeMap trie automatiquement par compareTo
    }

}
