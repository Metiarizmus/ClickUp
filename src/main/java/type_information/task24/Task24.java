package type_information.task24;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;


//Exercise 24: (4) Add Null Objects to RegisteredFactories.java.
public class Task24 {
    public static void main(String[] args) {


        for (int i = 0; i < 10; i++)
            System.out.println(Part.createRandom());


    }
}

interface Factory<T> {
    T create();
}

class Part {

    public String toString() {
        return getClass().getSimpleName();
    }

    public boolean isNull() {
        return false;
    }

    static List<Factory<? extends Part>> partFactories =
            new ArrayList<>();

    static {

        partFactories.add(new FuelFilter.Factory());
        partFactories.add(new AirFilter.Factory());
        partFactories.add(new CabinAirFilter.Factory());
        partFactories.add(new OilFilter.Factory());
        partFactories.add(new FanBelt.Factory());
        partFactories.add(new PowerSteeringBelt.Factory());
        partFactories.add(new GeneratorBelt.Factory());
    }

    private static Random rand = new Random(47);

    public static Part createRandom() {
        int n = rand.nextInt(partFactories.size());

        return partFactories.get(n).create();
    }
}

class NullPart extends Part {

    public String toString() {
        return "Null object";
    }

    public boolean isNull() {
        return true;
    }

    public static Part createRandom() {
        return new NullPart();
    }
}

class Filter extends Part {
}

class FuelFilter extends Filter {

    public static class Factory
            implements type_information.task24.Factory<FuelFilter> {

        public FuelFilter create() {
            return new FuelFilter();
        }
    }
}

class AirFilter extends Filter {
    public static class Factory
            implements type_information.task24.Factory<AirFilter> {

        public AirFilter create() {
            return new AirFilter();
        }
    }
}

class CabinAirFilter extends Filter {
    public static class Factory
            implements type_information.task24.Factory<CabinAirFilter> {

        public CabinAirFilter create() {
            return new CabinAirFilter();
        }
    }
}

class OilFilter extends Filter {
    public static class Factory
            implements type_information.task24.Factory<OilFilter> {

        public OilFilter create() {
            return new OilFilter();
        }
    }
}

class Belt extends Part {
}

class FanBelt extends Belt {
    public static class Factory
            implements type_information.task24.Factory<FanBelt> {

        public FanBelt create() {
            return new FanBelt();
        }
    }
}

class GeneratorBelt extends Belt {
    public static class Factory
            implements type_information.task24.Factory<GeneratorBelt> {

        public GeneratorBelt create() {
            return new GeneratorBelt();
        }
    }
}

class PowerSteeringBelt extends Belt {
    public static class Factory
            implements type_information.task24.Factory<PowerSteeringBelt> {

        public PowerSteeringBelt create() {
            return new PowerSteeringBelt();
        }
    }
}
