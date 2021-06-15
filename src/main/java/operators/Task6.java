package operators;

import operators.Task5.Dog;
/*
Following Exercise 5, create a new Dog reference and assign it to spot’s object. Test for comparison using == and equals( ) for all references
*/

public class Task6 {
    public static void main(String[] args) {
        Dog spot = new Dog("Spot","Ruff!");
        Dog scruffy = new Dog("Scruffy","Wurf!");

        Dog dog = spot;


        boolean b = (dog==spot);
        boolean q = (scruffy==spot);
        System.out.println("==: " + b);                    //true
        System.out.println("equals: " + dog.equals(spot)); //true
        System.out.println("spot = scruffy " + q);

    }
}


