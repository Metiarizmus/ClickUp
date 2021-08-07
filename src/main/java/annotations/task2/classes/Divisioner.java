package annotations.task2.classes;

import annotations.task2.annotations.ExtractInterface;

@ExtractInterface("IDivision")
public class Divisioner {

    public double division(double x, double y) {
        return x / y;
    }
    public int division (int x, int y) {
        return (x / y);
    }

}
