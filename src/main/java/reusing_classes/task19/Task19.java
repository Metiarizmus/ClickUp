package reusing_classes.task19;

/*
Exercise 19: (2) Create a class with a blank final reference to an object.
Perform the initialization of the blank final inside all constructors.
Demonstrate the guarantee that the final must be initialized before use, and that it cannot be changed once initialized
*/
public class Task19 {
    private final A a;

    public Task19() {
        a = new A("one");
        //a = new A("noOne"); I don't can do it
        System.out.println("A = " + a);
    }

    public Task19(int i) {
        a = new A("two");
        System.out.println("A = " + a);
    }

    public static void main(String[] args) {
        Task19 t1 = new Task19();
        Task19 t2 = new Task19(2);


    }
}

class A {
    private String name;

    A(String name) {
        this.name=name;
    }

    @Override
    public String toString() {
        return "A{" +
                "name='" + name + '\'' +
                '}';
    }
}
