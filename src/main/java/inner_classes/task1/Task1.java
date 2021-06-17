package inner_classes.task1;

/*
Exercise 1: (1) Write a class named Outer that contains an inner class named Inner.
Add a method to Outer that returns an object of type Inner.
In main( ), create and initialize a reference to an Inner.
*/
public class Task1 {
    public static void main(String[] args) {
        Outer o = new Outer();
        o.to();
    }
}

class Outer {

    class Inner {
        Inner(){
            System.out.println("its inner");
        }
    }

    public Inner to(){
        return new Inner();
    }


}