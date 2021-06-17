package inner_classes.task23;

import java.util.ArrayList;
import java.util.List;

/*
Exercise 23: (4) Create an interface U with three methods.
Create a class A with a method that produces a reference to a U by building an anonymous inner class.
 Create a second class B that contains an array of U. B should have one method that
  accepts and stores a reference to a U in the array, a second method that sets a reference in
  the array (specified by the method argument) to null, and a third method that moves through the array and
   calls the methods in U. In main( ), create a group of A objects and a single B.
   Fill the B with U references produced by the A objects..
    Use the B to call back into all the A objects. Remove some of the U references from the B.
*/
public class Task23 {
    public static void main(String[] args) {

        A a1 = new A();
        A a2 = new A();

        B b = new B();
        b.put(a1.ref());
        b.put(a2.ref());

        b.get();

    }
}

interface U {
    void one();

    void two();

    void three();
}

class A {
    U ref() {
        U u = new U() {
            @Override
            public void one() {
                System.out.println("one");
            }

            @Override
            public void two() {
                System.out.println("two");
            }

            @Override
            public void three() {
                System.out.println("three");
            }
        };
        return u;
    }
}

class B {
    private static List<Object> list = new ArrayList<>();

    public void put(U u){
        list.add(u);
    }

    public void reset(U u) {
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i).equals(u)){
                list.set(i,null);
            }
        }
    }

    public void get(){

        for (Object q : list){
            ((U) q).one();
            ((U) q).two();
            ((U) q).three();
        }

    }
}