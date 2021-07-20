package generics.task3;

//Exercise 3 : (1) Create and test a SixTuple generic.
public class Task3 {

    static SixTuple<Integer, Test, Character, Byte, String, Double> f() {
        return new SixTuple<>(1,new Test(),'3', (byte) 1,"s",1.1);
    }


    public static void main(String[] args) {

        System.out.println(f());

    }
}

class SixTuple<A, B, C, D, E, F> {
    public final A a;
    public final B b;
    public final C c;
    public final D d;
    public final E e;
    public final F f;

    public SixTuple(A a, B b, C c, D d, E e, F f) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
    }

    @Override
    public String toString() {
        return "SixTuple{" +
                "a=" + a +
                ", b=" + b +
                ", c=" + c +
                ", d=" + d +
                ", e=" + e +
                ", f=" + f +
                '}';
    }
}

class Test {

}