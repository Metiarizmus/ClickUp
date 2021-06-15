package initialization_cleanup.Task14;
/*
Create a class with a static String field that is initialized at the point of definition, and another one that is initialized by
the static block. Add a static method that prints both fields and demonstrates that they are both initialized before they are used
*/
public class Task14 {
    public static void main(String[] args) {
        Dog.printBoth();
    }
}

class Dog {
    static String lai = "Gav";
    static String voi;

    static {
        voi = "Voi";
    }

    static void printBoth(){
        System.out.println(lai);
        System.out.println(voi);
    }

}
