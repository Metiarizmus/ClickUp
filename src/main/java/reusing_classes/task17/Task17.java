package reusing_classes.task17;
/*
Modify Exercise 16 so that Frog overrides the method definitions from the base class (provides new definitions using the same method signatures).
Note what happens in main( )
*/
/*
Exercise 16: (2) Create a class called Amphibian. From this, inherit a class called Frog.
Put appropriate methods in the base class. In main( ), create a Frog and upcast it to Amphibian and demonstrate that all the methods still work.
*/
public class Task17 {
    public static void main(String[] args) {
        Amphibian amphibian = new Frog();
        amphibian.describe();
        amphibian.move();
    }
}

class Amphibian {
    void describe(){
        System.out.println("It's amphibian");
    }
    void move(){
        System.out.println("its can move");
    }
}

class Frog extends Amphibian{

    @Override
    void describe() {
        System.out.println("Oh it's describe in frog");
    }

    @Override
    void move() {
        System.out.println("it's can move too");
    }
}

