package strings.task6;

/*
Exercise 6: (2) Create a class that contains int, long, float and double fields.
Create a toString( ) method for this class that uses String.format( ), and demonstrate that your class works correctly.
 */
public class Task6 {
    public static void main(String[] args) {

        Example e = new Example(1, 2l, 3f, 4d);
        System.out.println(e);
    }
}

class Example {
    private int i;
    private long l;
    private float f;
    private double d;

    public Example(int i, long l, float f, double d) {
        this.i = i;
        this.l = l;
        this.f = f;
        this.d = d;
    }

    @Override
    public String toString() {
        return String.format("%d\n%d\n%f\n%f", i,l,f,d);
    }
}