package error_handling_with_exceptions.task2;

/*
Exercise 2: (1) Define an object reference and initialize it to null.
Try to call a method through this reference. Now wrap the code in a try-catch clause to catch the exception.
 */
public class Task2 {

    static void f(A a) {
        a.g();
    }
    public static void main(String[] args) {

        try {
            A a = null;
            f(a);
        }catch (NullPointerException e){
            System.out.println("a is null");
        }




    }
}

class A {
    void g() {
        System.out.println("g");
    }
}
