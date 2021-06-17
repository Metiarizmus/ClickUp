package inner_classes.task26;


/*
Exercise 26: (2) Create a class with an inner class that has a non-default constructor (one that takes arguments).
Create a second class with an inner class that inherits from the first inner class.
 */
public class Task26 {
    public static void main(String[] args) {


    }
}

class A {
    static class InnerA {
        InnerA(String s){
            System.out.println(s);
        }
    }
}

class B {

    class InnerB extends A.InnerA {

        InnerB(String s) {
            super(s);
        }
    }
}