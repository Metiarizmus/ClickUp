package enumerated_types.task2;

import java.util.Random;

/*
Exercise 2: (2) Instead of implementing an interface, make next( ) a static method. What are the benefits and drawbacks
of this approach?
 */
public class Task2 {

    public static void main(String[] args) {

        //now it is not necessary to have an instance of the enumeration

        for (int i = 0; i < 10; i++) {
            System.out.print(CartoonCharacter.next() + " , ");
        }


    }
}

enum CartoonCharacter {
    SLAPPY, SPANKY, PUNCHY, SILLY, BOUNCY, NUTTY, BOB;
    private static Random rand = new Random(47);

    public static CartoonCharacter next() {
        return values()[rand.nextInt(values().length)];
    }
}