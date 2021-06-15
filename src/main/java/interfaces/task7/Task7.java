package interfaces.task7;
//Exercise 7: (1) Change Exercise 9 in the Polymorphism chapter so that Rodent is an interface.
/*
Exercise 9: (3) Create an inheritance hierarchy of Rodent: Mouse, Gerbil, Hamster, etc.
In the base class, provide methods that are common to all Rodents, and override these in the derived classes to perform
different behaviors depending on the specific type of Rodent.
Create an array of Rodent, fill it with different specific types of Rodents, and call your base-class methods to see what happens
*/
public class Task7 {
    public static void main(String[] args) {



    }
}

interface Rodent {
    String voice();
    boolean move();
}

class Mouse implements Rodent {

    @Override
    public String voice() {
        return "mouse";
    }

    @Override
    public boolean move() {
        return true;
    }
}

class Gerbil implements Rodent {

    @Override
    public String voice() {
        return "Gerbil";
    }

    @Override
    public boolean move() {
        return false;
    }
}

class Hamster implements Rodent{

    @Override
    public String voice() {
        return "Hamster";
    }

    @Override
    public boolean move() {
        return true;
    }
}