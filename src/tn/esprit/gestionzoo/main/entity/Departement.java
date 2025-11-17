package tn.esprit.gestionzoo.main.entity;

public class Departement {
    private  int id;
    private  String nom;
    private int nbrEmployee;
    public  Departement(int id , String nom, int nbrEmployee) {
        this.id = id;
        this.nom = nom;
        this.nbrEmployee = nbrEmployee;
    }
    public Departement() {}

    public String getNom() {
        return nom;
    }

    public int getId() {
        return id;
    }

    public int getNbrEmployee() {
        return nbrEmployee;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setNbrEmployee(int nbrEmployee) {
        this.nbrEmployee = nbrEmployee;
    }

    @Override
    public boolean equals(Object obj) {
if (this == obj )return true;
if (obj == null || getClass() !=obj.getClass()) return false;
Departement e = (Departement) obj;
return this.id == e.id && this.nbrEmployee == e.nbrEmployee;

    }
    @Override
    public int hashCode() {
        int result = 17;
        result = 31 * result + id;
        result = 31 * result + nbrEmployee;
        return result;
    }
    @Override
    public String toString() {
        return "departement [id=" + id + ", nom=" + nom + "]";
    }
}
