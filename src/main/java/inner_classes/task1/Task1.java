package inner_classes.task1;


import inner_classes.task1_1.Other1;

/*
Exercise 1: (1) Write a class named Outer that contains an inner class named Inner.
Add a method to Outer that returns an object of type Inner.
In main( ), create and initialize a reference to an Inner.
*/
public class Task1 {
    public static void main(String[] args) {

        Other1 other = new Other1();
        other.to();

        Other1.Inner inner = other. new Inner();

        inner.fo();

    }

}

