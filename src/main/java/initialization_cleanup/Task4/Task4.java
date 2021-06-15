package initialization_cleanup.Task4;
/*
Add an overloaded constructor to the previous exercise that takes a String argument and prints it along with your message
*/
/*
Create a class with a default constructor (one that takes no arguments) that prints a message. Create an object of this class
*/
public class Task4 {
    public static void main(String[] args) {
        Default d = new Default();
        Default d1 = new Default("Hello");
    }
}
class Default{
    public Default() {
        System.out.println("It's a default constructor");
    }
    public Default(String message){
        System.out.println("It's an overloaded constructor + message " + message);
    }
}
