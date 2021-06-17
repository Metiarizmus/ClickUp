package inner_classes.task21;

/*
Exercise 21: (2) Create an interface that contains a nested class that has a static method that calls
the methods of your interface and displays the results.
Implement your interface and pass an instance of your implementation to the method.
*/
public class Task21 {
    public static void main(String[] args) {
        A.B.print();
    }
}

interface A {
    void f();
    void g();

     class B implements A {

        @Override
        public void f() {
            System.out.println("f");
        }

        @Override
        public void g() {
            System.out.println("g");
        }

         static void print(){
            new B().f();
            new B().g();

         }
    }
}


