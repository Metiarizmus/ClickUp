package initialization_cleanup.Task12;
/*
Create a class called Tank that can be filled and emptied, and has a termination condition that it must be empty when the object is cleaned up.
Write a finalize( ) that verifies this termination condition. In main( ), test the possible scenarios that can occur when your Tank is used.
*/
public class Task12 {
    public static void main(String[] args) {
        Tank tank1 = new Tank();
        tank1.fill();

        tank1.empty();

        if(tank1.filled!=true){
            tank1.finalize();
        }
        System.gc();

    }
}

class Tank {
    boolean filled = false;

    public void fill(){
        filled = true;
        System.out.println("full");
    }
    public void empty(){
        filled = false;
        System.out.println("empty");
    }

    protected void finalize() {
            System.out.println("You're throwing away a full tank of nothing!");
    }


}

