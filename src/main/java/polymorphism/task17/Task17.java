package polymorphism.task17;
/*
Exercise 17: (2) Using the Cycle hierarchy from Exercise 1, add a balance( ) method to Unicycle and Bicycle, but not to Tricycle.
Create instances of all three types and upcast them to an array of Cycle.
Try to call balance( ) on each element of the array and observe the results. Downcast and call balance( ) and observe what happens.
*/
public class Task17 {
    public static void main(String[] args) {

        Cycle[] x= {
          new Unicle(),
          new Bicycle(),
          new Tricycle()
        };

        ((Unicle) x[0]).balance();
        ((Bicycle) x[1]).balance();
    }
}
class Cycle {
    void ride(){
        System.out.println("Its cycle");
    }
}

class Unicle extends Cycle {
    @Override
    void ride() {
        System.out.println("its Unicle");
    }

    void balance(){
        System.out.println("balance in Unicle");
    }
}

class Bicycle extends Cycle {
    @Override
    void ride() {
        System.out.println("its Bicycle");
    }

    void balance(){
        System.out.println("balance in Bicycle");
    }
}

class Tricycle extends Cycle {
    @Override
    void ride() {
        System.out.println("its Tricycle");
    }
}
