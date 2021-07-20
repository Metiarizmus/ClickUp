package generics.task10;

//Exercise 10: (1) Modify the previous exercise so that one of f( )’s arguments is non-parameterized.

//Exercise 9: (1) Modify GenericMethods.java so that f( ) accepts three arguments, all of which are of a different parameterized type
public class Task10 {
    public static void main(String[] args) {
        GenericMethods gm = new GenericMethods();
        gm.f("", 1, 2.3);


    }
}

class GenericMethods {
    public <T,W> void f(T x, W w, Double u) {
        System.out.println(x.getClass().getName());
        System.out.println(w.getClass().getName());
        System.out.println(u.getClass().getName());
    }
}