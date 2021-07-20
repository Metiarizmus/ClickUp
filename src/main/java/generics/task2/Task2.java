package generics.task2;


/*
Exercise 2: (1) Create a holder class that holds three objects of the same type, along with the methods to store and
 fetch those objects and a constructor to initialize all three.
 */
public class Task2 {
    public static void main(String[] args) {

        Holder<A> holder = new Holder<>(new A(), new A(), new A());
        System.out.println(holder.getA());



    }
}

class Holder<T> {

    private T a;
    private T b;
    private T c;

    public Holder(T a, T b, T c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public void setA(T a) {
        this.a = a;
    }

    public void setB(T b) {
        this.b = b;
    }

    public void setC(T c) {
        this.c = c;
    }

    public T getA() {
        return a;
    }

    public T getB() {
        return b;
    }

    public T getC() {
        return c;
    }
}

class A {

}

