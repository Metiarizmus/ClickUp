package strings.task10;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
Exercise 10: (2) For the phrase "Java now has regular expressions" evaluate whether the following expressions will find a match:
^Java
\Breg.*
n.w\s+h(a|i)s
s?
s*
s+
s{4}
S{1}.
s{0,3}
 */
public class Task10 {

    private static String s = "Java now has regular expressions";

    public static void main(String[] args) {

        List<String> list = new ArrayList<>(9);
        list.add("^Java");
        list.add("\\Breq.*");
        list.add("n.w\s+h(a|i)s");
        list.add("s?");
        list.add("s*");
        list.add("s+");
        list.add("s{4}");
        list.add("S{1}");
        list.add("s{0,3}");

        for (String q : list) {

            Pattern pattern = Pattern.compile(q);
            Matcher matcher = pattern.matcher(s);

            if (matcher.find()){
                System.out.println(q + "  ---->  true");
            }else System.out.println(q + "  ---->  false");

        }


    }
}
