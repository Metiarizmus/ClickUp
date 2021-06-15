package initialization_cleanup.Task9;
/*
Create a class with two (overloaded) constructors. Using this, call the second constructor inside the first one.
*/
public class Task9 {
    public static void main(String[] args) {
        Example example = new Example(2,3);
    }
}
class Example {
    public Example(int a) {
        System.out.println("a = "+a);
    }

    public Example(int a,int b){
        this(a);
        System.out.println("b = " + b);
    }
}
