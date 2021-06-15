package polymorphism.task12;

import java.util.ArrayList;
import java.util.List;

/*
Exercise 9: (3) Create an inheritance hierarchy of Rodent: Mouse, Gerbil, Hamster, etc.
In the base class, provide methods that are common to all Rodents, and override these in the derived classes to perform
different behaviors depending on the specific type of Rodent.
Create an array of Rodent, fill it with different specific types of Rodents, and call your base-class methods to see what happens
*/
/*
Exercise 12: (3) Modify Exercise 9 so that it demonstrates the order of initialization of the base classes and derived classes.
Now add member objects to both the base and derived classes and show the order in which their initialization occurs during construction
*/
public class Task12 {
    public static void main(String[] args) {
        List<Rodent> list = new ArrayList<>();
        list.add(new Gerbil());
        //list.add(new Mouse());
        list.add(new Hamster());


        for (Rodent q : list) {
            q.loud();
        }
    }
}

class Rodent {
    void loud(){

    }
    private String mes = "check static mes from Rodent";

   Rodent(){
       System.out.println(mes);
       mes = "000";
       System.out.println("Hi from Rodent");
       System.out.println(mes);

   }

}

class Mouse extends Rodent {

    private static String mes = "check static mes from Mouse";

    @Override
    void loud() {
        System.out.println("Im a mouse");
        System.out.println(mes);
    }
}

class Gerbil extends Rodent {
    private static String mes = "check static mes from Gerbil";

    @Override
    void loud() {
        System.out.println("Im a gerbil");
        System.out.println(mes);
    }
}

class Hamster extends Rodent{
    private static String mes = "check static mes from Hamster";
    @Override
    void loud() {
        System.out.println("Im a hamster");
        System.out.println(mes);
    }
}