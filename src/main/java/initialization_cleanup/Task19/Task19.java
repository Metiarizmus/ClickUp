package initialization_cleanup.Task19;
/*
Write a method that takes a vararg String array. Verify that you can pass either a comma-separated list of Strings or a String[] into this method
*/
public class Task19 {
    public static void main(String[] args) {
        String[] s = {"1","2","3"};

        String s1 = "1";
        String s2 = "2";

        example(s);
        example(s1,s2);
    }

    static void example(String... s) {
        for (String q : s){
            System.out.println(q);
        }
    }
}
