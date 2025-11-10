package tn.esprit.gestionzoo.main.entity;

public interface IGestion<T> {
    void ajouterEmploye(T t);
    boolean rechercherEmploye(String nom);
    boolean rechercherEmploye(T t);
    void supprimerEmploye(T t);
    void displayEmploye();
    void trierEmployeParId(); // Comparable
    void trierEmployeParNomDépartementEtGrade(); // Comparator
}
