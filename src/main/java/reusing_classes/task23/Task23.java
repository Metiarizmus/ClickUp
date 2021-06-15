package reusing_classes.task23;

/*
Exercise 23: (2) Prove that class loading takes place only once.
Prove that loading may be caused by either the creation of the first instance of that class or by the access of a static member.
*/
public class Task23 {
    public static void main(String[] args) {
        Beetle b = new Beetle();
    }
}

class Insect {
    private int i = 9;
    protected int j;
    Insect() {
        System.out.println("i = " + i + ", j = " + j);
        j = 39;
    }
    private static int x1 =
            printInit("static Insect.x1 initialized");
    static int printInit(String s){
        System.out.println(s);
        return 47;
    }
}

 class Beetle extends Insect {
    private int k = printInit("Beetle.k initialized");

    public Beetle() {
        System.out.println("k = " + k);
        System.out.println("j = " + j);
    }

    private static int x2 =
            printInit("static Beetle.x2 initialized");
}
