package type_information.task4;

/*
Exercise 4: (2) Modify the previous exercise so that it uses instanceof to check the type before performing the downcast.
 */

import java.util.Arrays;
import java.util.List;

/*
(2) Add Rhomboid to Shapes.java. Create a Rhomboid, upcast it to a Shape, then downcast it back to a Rhomboid.
 Try downcasting to a Circle and see what happens.
 */
public class Task4 {
    public static void main(String[] args) {
        List<Shape> shapeList = Arrays.asList(
                new Circle(), new Square(), new Triangle()
        );

        for (Shape shape : shapeList) {
            shape.draw();

            if (shape instanceof Rhomboid) {
                Rhomboid r = (Rhomboid) shape;

            }

            if (shape instanceof Circle) {
                Circle c = (Circle) shape;
            }
        }

    }
}

abstract class Shape {
    void draw() {
        System.out.println(this + ".draw()");
    }

    abstract public String toString();
}

class Circle extends Shape {
    public String toString() {
        return "Circle";
    }
}

class Square extends Shape {
    public String toString() {
        return "Square";
    }
}

class Triangle extends Shape {
    public String toString() {
        return "Triangle";
    }
}

class Rhomboid extends Shape {
    public String toString() {
        return "Rhomboid";
    }
}