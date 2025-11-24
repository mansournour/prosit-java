package tn.esprit.gestionzoo.main.entity;

import java.util.Objects;

public abstract class Employe implements Comparable<Employe> {
    private int id ;
    private String nom;
    private String prenom;
    private String nomDepartement ;
    private int grade ;

    public int getId() {
        return id;
    }

    public int getGrade() {
        return grade;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public String getNomDepartement() {
        return nomDepartement;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public void setNomDepartement(String nomDepartement) {
        this.nomDepartement = nomDepartement;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setId(int id) {
        this.id = id;
    }
    @Override
    public int compareTo(Employe o) {
        return this.id - o.id;
    }

    public Employe(int id, String nom, String prenom, String nomDepartement, int grade) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.nomDepartement = nomDepartement;
        this.grade = grade;
    }

    public Employe() {
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Employe employe = (Employe) o;
        return id == employe.id && Objects.equals(nom, employe.nom);
    }

    @Override
    public String toString() {
        return "Employe{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", nomDepartement='" + nomDepartement + '\'' +
                ", grade=" + grade +
                '}';
    }
}
