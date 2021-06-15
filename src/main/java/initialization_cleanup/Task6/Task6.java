package initialization_cleanup.Task6;
/*
Modify the previous exercise so that two of the overloaded methods have two arguments (of two different types),
but in reversed order relative to each other. Verify that this works.
*/
/*
Create a class called Dog with an overloaded bark( ) method. This method should be overloaded based on various primitive data types,
and print different types of barking, howling, etc., depending on which overloaded version is called.
Write a main( ) that calls all the different versions.
*/
public class Task6 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.bark("Gav");
        dog.bark(1,1.1);
        dog.bark(1.1,1);
    }
}
class Dog {
    void bark(String barking) {
        System.out.println("I'm barking right now " + barking);
    }
    void bark(int one,double two){
        System.out.println(one + " I'm a number " + two);
    }
    void bark(double one,int two) {
        System.out.println(one + " I'm a number " + two);
    }
}
