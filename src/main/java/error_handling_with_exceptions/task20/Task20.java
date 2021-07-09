package error_handling_with_exceptions.task20;

/*
Exercise 20: (3) Modify StormyInning.java by adding an UmpireArgument exception type and methods that throw this exception.
Test the modified hierarchy.
 */
public class Task20 {
    public static void main(String[] args) {

        try {
            StormyInning si = new StormyInning();
            si.atBat();
            si.throwUmpireArgument();
        } catch (PopFoul e) {
            System.out.println("Pop foul");
        } catch (RainedOut e) {
            System.out.println("Rained out");
        } catch (BaseballException e) {
            System.out.println("Generic baseball exception");
        } catch (UmpireArgument e) {

        }

        try {

            Inning i = new StormyInning();
            i.atBat();

        } catch (Strike e) {
            System.out.println("Strike");
        } catch (Foul e) {
            System.out.println("Foul");
        } catch (RainedOut e) {
            System.out.println("Rained out");
        } catch (BaseballException e) {
            System.out.println("Generic baseball exception");
        }
    }

}

class BaseballException extends Exception {
}

class Foul extends BaseballException {
}

class Strike extends BaseballException {
}

class UmpireArgument extends Exception{

}
abstract class Inning {
    public Inning() throws BaseballException {
    }

    public void event() throws BaseballException {

    }

    public abstract void atBat() throws Strike, Foul;

    public void walk() {
    } // Throws no checked exceptions
}

class StormException extends Exception {
}

class RainedOut extends StormException {
}

class PopFoul extends Foul {
}

interface Storm {
    public void event() throws RainedOut;

    public void rainHard() throws RainedOut;
}

class StormyInning extends Inning implements Storm {

    public StormyInning()
            throws RainedOut, BaseballException {
    }

    public StormyInning(String s)
            throws Foul, BaseballException {
    }

    public void rainHard() throws RainedOut {
    }

    public void event() {
    }


    public void atBat() throws PopFoul {
    }

    public void throwUmpireArgument() throws UmpireArgument {}
}