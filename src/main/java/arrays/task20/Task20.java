package arrays.task20;

import java.util.Arrays;
import java.util.Objects;

/*
Exercise 20: (4) Demonstrate deepEquals( ) for multidimensional arrays.
*/
public class Task20 {
    public static void main(String[] args) {

        int[][] a = {{1,2,3},{1,2,3}};

        int[][] b = {{1,2,3},{1,2,3}};

        System.out.println(Arrays.equals(a,b));
        System.out.println(Arrays.deepEquals(a,b));

        System.out.println((new A("Alex",1).equals(new A("Alex",1))));

        System.out.println(Arrays.deepEquals(new A[]{new A("Alex", 1)}, new A[]{new A("Alex", 1)}));
    }
}

class A {
    private String name;
    private int id;

    public A(String name, int id) {
        this.name = name;
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        A a = (A) o;
        return id == a.id && Objects.equals(name, a.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, id);
    }
}
