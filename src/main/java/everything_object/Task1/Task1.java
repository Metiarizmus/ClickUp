package everything_object.Task1;
/*Create a class containing an int and a char that are not initialized,
and print their values to verify that Java performs default initialization.*/

public class Task1 {
    public static void main(String[] args) {

        Test test = new Test();
        System.out.println(test.getI());
        System.out.println(test.getC()+";empty");

    }
}

