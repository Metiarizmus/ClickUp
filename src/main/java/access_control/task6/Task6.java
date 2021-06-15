package access_control.task6;
/*
Create a class with protected data. Create a second class in the same file with a method that manipulates the protected data in
the first class
*/
public class Task6 {
    public static void main(String[] args) {
        M m = new M();
        m.getA();
        m.getB();
    }
}
class M {
    private int a;
    private String b;

    public int getA() {
        return a;
    }

    public String getB() {
        return b;
    }
}
