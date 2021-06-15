package interfaces.task18;

/*
Exercise 18: (2) Create a Cycle interface, with implementations Unicycle, Bicycle and Tricycle.
Create factories for each type of Cycle, and code that uses these factories.
 */
public class Task18 {
    public static void main(String[] args) {
        Factories f = new Factories();
        f.cycleFactories(new TricycleFactory());
    }
}

interface Cycle {
    void move();

    void stop();
}

interface CycleFactory {
    Cycle getCycle();
}

class Unicycle implements Cycle {

    @Override
    public void move() {
        System.out.println("Unicycle move");
    }

    @Override
    public void stop() {
        System.out.println("Unicycle stop");
    }
}

class UnicycleFactory implements CycleFactory {

    @Override
    public Cycle getCycle() {
        return new Unicycle();
    }
}

class Bicycle implements Cycle {

    @Override
    public void move() {
        System.out.println("Bicycle move");
    }

    @Override
    public void stop() {
        System.out.println("Bicycle stop");
    }
}

class BicycleFactory implements CycleFactory {

    @Override
    public Cycle getCycle() {
        return new Bicycle();
    }
}


class Tricycle implements Cycle {

    @Override
    public void move() {
        System.out.println("Tricycle move");
    }

    @Override
    public void stop() {
        System.out.println("Tricycle stop");
    }
}

class TricycleFactory implements CycleFactory {

    @Override
    public Cycle getCycle() {
        return new Tricycle();
    }
}

class Factories {
    public void cycleFactories(CycleFactory factory) {
        Cycle c = factory.getCycle();
        c.move();
        c.stop();
    }
}