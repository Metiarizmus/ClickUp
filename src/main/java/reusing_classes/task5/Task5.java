package reusing_classes.task5;

/*
Create two classes, A and B, with default constructors (empty argument lists) that announce themselves.
Inherit a new class called C from A, and create a member of class B inside C. Do not create a constructor for C.
Create an object of class C and observe the results
*/
public class Task5 {
    public static void main(String[] args) {
        C c = new C();
        /*
        output:
                It's A
                It's B
         */
    }
}

class A {

    public A() {
        System.out.println("It's A");
    }
}

class B {
     public B() {
        System.out.println("It's B");
    }
}

class C extends A {
     B b;
}
