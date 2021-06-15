package reusing_classes.task1;

public class A {

    private A() {

    }

   static class B {

        static public B getB() {
            B b;
            b = new B();

            return b;
        }
    }

}
