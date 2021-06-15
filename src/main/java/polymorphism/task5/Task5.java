package polymorphism.task5;

/*
Exercise 5: (1) Starting from Exercise 1, add a wheels( ) method in Cycle, which returns the number of wheels.
Modify ride( ) to call wheels( ) and verify that polymorphism works.
*/
public class Task5 {
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
    void ride() {
        System.out.println("Its cycle " + wheels());
    }

    int wheels() {
        return 2;
    }
}

class Unicle extends Cycle {
    @Override
    void ride() {
        System.out.println("its Unicle " + wheels());
    }

    @Override
    int wheels() {
        return 1;
    }
}

class Bicycle extends Cycle {
    @Override
    void ride() {
        System.out.println("its Bicycle " + wheels());
    }

    @Override
    int wheels() {
        return 2;
    }
}

class Tricycle extends Cycle {
    @Override
    void ride() {
        System.out.println("its Tricycle " + wheels());
    }

    @Override
    int wheels() {
        return 3;
    }
}
