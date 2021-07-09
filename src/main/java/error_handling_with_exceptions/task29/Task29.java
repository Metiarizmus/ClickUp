package error_handling_with_exceptions.task29;

/*
Exercise 29: (1) Modify all the exception types in Stormylnning.java so that they extend RuntimeException, and show that no exception specifications or try blocks are necessary.
Remove the ‘//!’ comments and show how the methods can be compiled without specifications.
*/
public class Task29 {
    public static void main(String[] args) {

        StormyInning si = new StormyInning();
        si.atBat();

        Inning i = new StormyInning();
        i.atBat();


    }
}

class BaseballException extends RuntimeException {
}

class Foul extends RuntimeException {
}

class Strike extends RuntimeException {
}

abstract class Inning {
    public Inning() throws BaseballException {
    }

    public void event() throws BaseballException {
    }

    public abstract void atBat() throws Strike, Foul;

    public void walk() {
    }
}

class StormException extends RuntimeException {
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

    public void walk() throws PopFoul {
    }

    public void event() throws RainedOut {
    }

    public void rainHard() throws RainedOut {
    }


    public void atBat() throws PopFoul {
    }
}