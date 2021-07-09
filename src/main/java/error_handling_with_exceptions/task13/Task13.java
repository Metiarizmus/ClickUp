package error_handling_with_exceptions.task13;


import error_handling_with_exceptions.task9.myException.OneException;
import error_handling_with_exceptions.task9.myException.ThreeException;
import error_handling_with_exceptions.task9.myException.TwoException;

/*
Exercise 13: (2) Modify Exercise 9 by adding a finally clause. Verify that your finally clause is executed,
even if a NullPointerException is thrown.

Exercise 9: (2) Create three new types of exceptions. Write a class with a method that throws all three.
In main( ), call the method but only use a single catch clause that will catch all three types of exceptions.
 */
public class Task13 {
    public static void main(String[] args) {

        Builder b = new Builder();

        try {
            b.build(null);
        } catch (OneException e) {
            e.printStackTrace();
        }finally {
            System.out.println("all will build later");
        }

    }
}

class Builder {

    void build(Home h) throws OneException, TwoException, ThreeException {
        if(h != null){
            System.out.println("h is building");
        }else new NullPointerException();

    }
}

class Home {

}