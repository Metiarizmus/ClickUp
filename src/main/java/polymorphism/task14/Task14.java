package polymorphism.task14;

import java.util.ArrayList;
import java.util.List;

/*
(4) Modify Exercise 12 so that one of the member objects is a shared object with reference counting, and demonstrate that it works properly.
*/
public class Task14 {
    public static void main(String[] args) {
        Gener gener = new Gener();

        List<Rodent> list = new ArrayList<>();
        list.add(new Gerbil(gener));
        list.add(new Mouse(gener));
        list.add(new Hamster(gener));


        for (Rodent q : list) {
            q.loud();
        }

    }
}

class Gener {
    private int count = 0;
    private static long counter = 0;
    private final long id = counter++;

    public void addCount(){
        count++;
    }

    public String toString() { return "Gener " + id; }

}
class Rodent {
    private Gener gener;
    private static long counter = 0;
    private final long id = counter++;
    void loud(){

    }
    private String mes = "check static mes from Rodent";

    Rodent(Gener gener){
        System.out.println("Creating " + this);
        this.gener=gener;
        this.gener.addCount();
        System.out.println(mes);
        mes = "000";
        System.out.println("Hi from Rodent");
        System.out.println(mes);

    }

    @Override
    public String toString() {
        return "Rodent{" +
                "id=" + id +
                '}';
    }
}

class Mouse extends Rodent {

    Gener gener;
    private static String mes = "check static mes from Mouse";

    Mouse(Gener gener){
        super(gener);
        this.gener=gener;
        gener.addCount();
    }

    @Override
    void loud() {
        System.out.println("Im a mouse");
        System.out.println(mes);
    }

    public String toString() {
        return  "Mouse, " + super.toString();
    }
}

class Gerbil extends Rodent {
    Gerbil(Gener gener){
        super(gener);
        gener.addCount();
    }
    private static String mes = "check static mes from Gerbil";

    @Override
    void loud() {
        System.out.println("Im a gerbil");
        System.out.println(mes);
    }

    public String toString() {
        return "Gerbil, " + super.toString();
    }
}

class Hamster extends Rodent {

    Hamster(Gener gener) {
        super(gener);
        gener.addCount();
    }
    private static String mes = "check static mes from Hamster";
    @Override
    void loud() {
        System.out.println("Im a hamster");
        System.out.println(mes);
    }

    public String toString() {
        return "Hamster, " + super.toString();
    }
}