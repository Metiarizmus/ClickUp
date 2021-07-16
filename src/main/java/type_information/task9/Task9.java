package type_information.task9;
import java.lang.reflect.Field;

/*
Exercise 9: (5) Modify the previous exercise so that it uses Class.getDeclaredFields( )
to also display information about the fields in a class
 */
/*
Exercise 8: (5) Write a method that takes an object and recursively prints all the classes in that object’s hierarchy.
 */

public class Task9<E> {
    public static void main(String[] args) {

        Task9<A> b = new Task9<>();

        b.prints(A.class);

    }

     void prints(Class<E> c) {

        if (c.getSuperclass() == null){
            System.out.println(c.getName());
            return;
        }

        prints((Class<E>) c.getSuperclass());
         System.out.println(c.getName());

         for (Field field : c.getDeclaredFields()){
             System.out.println(field.getName());
         }
    }

}

class Base {
    private String itsBase = "Base";

}

class A extends  Base {
    private String itsA = "A";


}

class B extends  Base {

}

class C extends  Base {

}

class D {

}