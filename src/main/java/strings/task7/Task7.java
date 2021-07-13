package strings.task7;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
Exercise 7: (5) Using the documentation for java.util.regex.Pattern as a resource, write and test a regular expression that
 checks a sentence to see that it begins with a capital letter and ends with a period.
 */
public class Task7 {
    public static void main(String[] args) {

        reg("hI everyone..");


    }

    static void reg(String s) {

        Pattern pattern = Pattern.compile("^([a-z]).+\\W$");
        Matcher matcher = pattern.matcher(s);
        if (matcher.find()){
            System.out.println("true");
        }else System.out.println("false");
    }
}
