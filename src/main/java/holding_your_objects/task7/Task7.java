package holding_your_objects.task7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
Exercise 7: (3) Create a class, then make an initialized array of objects of your class.
Fill a List from your array. Create a subset of your List by using subList( ), then remove this subset from your List.
*/
public class Task7 {
    public static void main(String[] args) {
        Dog[] dogs = new Dog[5];
        for (int i = 0; i < dogs.length; i++) {
            dogs[i] = new Dog();
        }

        List<Dog> list = new ArrayList<>();
        list.addAll(Arrays.asList(dogs));

        List<Dog> listSub = list.subList(0, 3);

        list.removeAll(listSub);
    }
}

class Dog {

}
