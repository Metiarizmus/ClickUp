package arrays.task9;

import java.util.ArrayList;
import java.util.List;

/*
Exercise 9: (3) Create the classes necessary for the Peel<Banana> example and show that the compiler doesn’t accept it.
Fix the problem using an ArrayList.

Peel<Banana>[] peels = new Peel<Banana> [10];

 */
public class Task9 {
    @SuppressWarnings("unchecked")
    public static void main(String[] args) {

        //Peel<Banana>[] peels = new Peel<Banana> [10];  doesn’t accept it

        List<Banana>[] peels = (List<Banana>[]) new List[3];

        for (int i = 0; i < peels.length; i++) {
            peels[i] = new ArrayList<Banana>();
        }

    }
}

class Peel {

}

class Banana {

}