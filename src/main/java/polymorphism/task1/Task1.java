package polymorphism.task1;
/*
Exercise 1: (2) Create a Cycle class, with subclasses Unicycle, Bicycle and Tricycle.
 Demonstrate that an instance of each type can be upcast to Cycle via a ride( ) method.
 */
public class Task1 {
    public static void main(String[] args) {
        Cycle c1 = new Unicle();
        Cycle c2 = new Bicycle();
        Cycle c3 = new Tricycle();

        c1.ride();
        c2.ride();
        c3.ride();
    }
}

class Cycle {
    void ride(){
        System.out.println("Its cycle");
    }
}

class Unicle extends Cycle{
    @Override
    void ride() {
        System.out.println("its Unicle");
    }
}

class Bicycle extends Cycle {
    @Override
    void ride() {
        System.out.println("its Bicycle");
    }
}

class Tricycle extends Cycle {
    @Override
    void ride() {
        System.out.println("its Tricycle");
    }
}

