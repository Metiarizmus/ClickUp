package access_control.task5;

import access_control.task5.test.Test;

/*
Create a class with public, private, protected, and package-access fields and method members.
Create an object of this class and see what kind of compiler messages you get when you try to access all the class members.
Be aware that classes in the same directory are part of the “default” package
*/
public class Task5 {

    public static void main(String[] args) {
        Test test = new Test();
        //test.c = 1;
        //test.a = 2; java: a has private access in access_control.task5.test.Test
        //test.b = 1; java: b has protected access in access_control.task5.test.Test
        //test.d = 1; java: d is not public in access_control.task5.test.Test; cannot be accessed from outside package

        test.getC();
        test.getA();
        test.getB();
        test.getD();
    }
}
