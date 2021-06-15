package reusing_classes.task18;


/*
Exercise 18: (2) Create a class with a static final field and a final field and demonstrate the difference between the two.
*/
public class Task18 {
    static final int ID = 1;
    final int number = 2;


    public static void main(String[] args) {
        Task18 t1 = new Task18();
        Task18 t2 = new Task18();
        Task18 t3 = new Task18();

        System.out.println(t1.number);
        System.out.println(t2.number);
        System.out.println(t3.number);

        System.out.println(Task18.ID);// static is variable for all classes



    }
}
