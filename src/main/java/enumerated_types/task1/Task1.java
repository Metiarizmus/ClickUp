package enumerated_types.task1;
import static enumerated_types.task1.Signal.*;
//Exercise 1: (2) Use a static import to modify TrafficLight.java so you don’t have to qualify the enum instances.
public class Task1 {
    Signal color = RED;

    public void change() {

        switch (color) {
// Note that you don’t have to say Signal.RED
// in the case statement:
            case RED:
                color = GREEN;
                break;
            case GREEN:
                color = YELLOW;
                break;
            case YELLOW:
                color = RED;
                break;
        }
    }

    public String toString() {
        return "The traffic light is " + color;
    }

    public static void main(String[] args) {
        Task1 t = new Task1();
        for (int i = 0; i < 7; i++) {
            System.out.println(t);
            t.change();
        }
    }
}