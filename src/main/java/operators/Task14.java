package operators;
/*
Write a method that takes two String arguments and uses all the boolean comparisons to compare the two Strings
and print the results. For the == and !=, also perform the equals( ) test. In main( ), call your method with some
different String objects
*/
public class Task14 {
    public static void main(String[] args) {
        operators("abc","clr");
        operators("a","a");
        operators("ABC","abc");
    }

    static void operators(String s1, String s2){
        System.out.println("s1==s2 "        + s1==s2);
        System.out.println("s1.equals(s2) " + s1.equals(s2));
        System.out.println("s1!=s2 "        + s1!=s2);

        StringBuilder stringBuilder = new StringBuilder(s1);
        boolean contentEquals = s2.contentEquals(stringBuilder);
        System.out.println("s2.contentEquals(stringBuilder) " + contentEquals);

        System.out.println();
    }
}
