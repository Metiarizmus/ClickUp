package type_information.tets_to25;

import type_information.task25.Task25;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Test25  {
    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InstantiationException, InvocationTargetException {

        Class<?> c = Task25.class;
        Object obj = c.newInstance();

        Method priv = c.getDeclaredMethod("privateHi");
        priv.setAccessible(true);
        System.out.println( priv.invoke(obj, null));

        Method prot = c.getDeclaredMethod("protectedHi");
        prot.setAccessible(true);
        System.out.println( prot.invoke(obj, null));

        Method def = c.getDeclaredMethod("defaultHi");
        def.setAccessible(true);
        System.out.println( def.invoke(obj, null));
    }
}
