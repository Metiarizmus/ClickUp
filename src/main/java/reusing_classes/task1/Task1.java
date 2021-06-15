package reusing_classes.task1;

//Create a simple class. Inside a second class, define a reference to an object of the first class. Use lazy initialization to instantiate this object.
public class Task1 {
    public static void main(String[] args) {

        System.out.println(A.B.getB()); //reusing_classes.task1.A@5fd0d5ae
        System.out.println(A.B.getB()); //

    }
}


