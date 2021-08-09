package annotations.task11.handler_annotation;

import annotations.task11.annotations.TestNote;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class HandlerAnnotation {

    public static void catchAnnotation(Class<?> c) throws Exception {
        if (c == null) {
            System.exit(1);
        }
        for (Method q : c.getDeclaredMethods()) {
            if (q.isAnnotationPresent(TestNote.class)){
                TestNote note = q.getAnnotation(TestNote.class);

                System.out.println(note.note() + " and result of method is: ");
                System.out.println(q.invoke(c.newInstance()));
            }
        }
    }
}
