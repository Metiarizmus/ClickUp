package access_control.task3;

/*
Create two packages: debug and debugoff, containing an identical class with a debug( ) method.
The first version displays its String argument to the console, the second does nothing.
Use a static import line to import the class into a test program, and demonstrate the conditional compilation effect.
*/


import static access_control.task3.debug.Deb.debug;
import static access_control.task3.debugoff.Deb.debug;

public class Task3 {
    public static void main(String[] args) {

        debug("hi one");
        debug();
    }
}
