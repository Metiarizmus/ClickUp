package generics.task34;

/*
Exercise 34: (4) Create a self-bounded generic type that contains an abstract method that takes an argument of the generic type
 parameter and produces a return value of the generic type parameter.
 In a non-abstract method of the class, call the abstract method and return its result.
 Inherit from the self-bounded type and test the resulting class.
 */
public class Task34 {
    public static void main(String[] args) {

        D d = new D();

        System.out.println(d.setT(d).returnT(d));
    }
}

abstract class SelfBounded<T extends SelfBounded<T>> {

        abstract T setT(T arg);

        T returnT(T t){
            return setT(t);
        }

}

class D extends SelfBounded<D> {

    @Override
    D setT(D arg) {
        return arg;
    }
}