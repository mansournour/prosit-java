import java.lang.reflect.AnnotatedWildcardType;
import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
           Zoo myZoo = new Zoo("myZoo","sfax",3 ,0) ;


Animal a1 =new Animal("Félidé",true,3,"lion");
        Animal a2 =new Animal("chien",false ,2,"chien");

       // myZoo.animals[0]=a1;
//System.out.println (myZoo.displayZoo() );
        //instruction10
System.out.println (myZoo.AddAnimal(a1));
System.out.println (myZoo.AddAnimal(a2));
//instruction11
        System.out.println(myZoo.searchAnimal(a1)); //pas un autr elion
        Animal a3 =new Animal("f" , true ,2,"lion");
        System.out.println (myZoo.searchAnimal(a3)); //retourne l'indice de la 1  er lion trouver va rester 0 donc

}

}

