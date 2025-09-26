import java.util.Arrays;

public class Zoo {
    Animal[] animals;
    String name;
    String city;
    int nbrCages ;

    public String displayZoo() {
        return "Zoo{" +
                ", name='" + name + '\'' +
                ", city='" + city + '\'' +
                ", nbrCages=" + nbrCages +
                '}';
    }



    public Zoo( String name, String city, int nbrCages) {
        //l'initialisation se faite dans le constructeur
        animals = new   Animal[nbrCages];
        this.name = name;
        this.city = city;
        this.nbrCages = nbrCages;
    }


}

