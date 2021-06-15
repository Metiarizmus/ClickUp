package everything_object;

public class Task8 {
    public static void main(String[] args) {

        Test1 test1 = new Test1();
        Test1 test2 = new Test1();
        Test1 test3 = new Test1();

        Test1.i=1;
        Test1.i=2;

        System.out.println(Test1.i);
        System.out.println(test2.i);
        System.out.println(test3.i);
    }
}

class Test1 {
     static int i;
}
