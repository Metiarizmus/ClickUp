package annotations.task11;

import annotations.task11.handler_annotation.HandlerAnnotation;

import java.lang.reflect.InvocationTargetException;

/*
Exercise 11: (5) Add an @TestNote annotation to @Unit, so that the accompanying note is simply displayed during testing.
*/
public class Task11 {
    public static void main(String[] args) {

        try {
            HandlerAnnotation.catchAnnotation(TestHandler.class);
        } catch (Exception e) {
            e.printStackTrace();

        }
    }
}
