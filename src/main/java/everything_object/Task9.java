package everything_object;
/*
Write a program that demonstrates that autoboxing works for all the primitive types and their wrappers
 */
public class Task9 {
    public static void main(String[] args) {

        int integer = 2;
        boolean bool = true;
        Float f = 3.14f;
        example(integer,bool,f);

        Long longBox = 3L;
        long longPrimitive = longBox;
        System.out.println(longBox + " - box");
        System.out.println(longPrimitive + " - primitive");

    }

    static void example(Integer integer,Boolean bool, float f){
        System.out.println(integer);
        System.out.println(bool);
        System.out.println(f);
    }
}
