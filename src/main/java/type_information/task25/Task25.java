package type_information.task25;

/*
Exercise 25: (2) Create a class containing private, protected and package-access methods.
Write code to access these methods from outside of the class’s package.
 */
public class Task25 {

    private void privateHi() {
        System.out.println("hi private");
    }

    protected void protectedHi() {
        System.out.println("hi protected");
    }

    void defaultHi() {
        System.out.println("hi default");
    }
}
