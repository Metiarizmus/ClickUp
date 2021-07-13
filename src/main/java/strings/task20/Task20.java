package strings.task20;

/*
Exercise 20: (2) Create a class that contains int, long, float and double and String fields.
Create a constructor for this class that takes a single String argument, and scans that string into the various fields.
Add a toString( ) method and demonstrate that your class works correctly.
 */

import java.util.Scanner;

public class Task20 {
    public static void main(String[] args) {

        Test t = new Test("1 23 3.14 5.1543 qwe");
        System.out.println(t);

    }
}

class Test {
    private int i;
    private long l;
    private float f;
    private double d;
    private String st;

    public Test(String string) {
        Scanner scanner = new Scanner(string);
        String[] s = scanner.nextLine().split(" ");
        i = Integer.parseInt(s[0]);
        l = Long.parseLong(s[1]);
        f = Float.parseFloat(s[2]);
        d = Double.parseDouble(s[3]);
        st = s[4];

    }

    @Override
    public String toString() {
        return "Test{" +
                "i=" + i +
                ", l=" + l +
                ", f=" + f +
                ", d=" + d +
                ", s='" + st + '\'' +
                '}';
    }
}