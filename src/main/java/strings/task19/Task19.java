package strings.task19;


import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


/*
exercise 19: (8) building on the previous two exercises, write a program that examines
java source code and produces all the class names used in a particular program.
*/
public class Task19 {

    String s = "It's difficult task";

    private static HelperPath path = new HelperPath();

    public static void main(String[] args) {

        Set<String> list = retrieveCapital();
        Set<String> set = retrieveBacktick();


        list.removeIf(x -> set.contains(x));

        String[] s = retrieveClasses().split(" ");
        list.addAll(Arrays.asList(s));

        if (list.remove("")) ;
        System.out.println(list);


    }


    //retrieve all words with a capital letter
    /*
    for example Pattern.compile here Pattern is class or Set<String> set = new HashSet<>(); here classes are Set, String, HashSet
     */
    static Set<String> retrieveCapital() {
        Pattern p1 = Pattern.compile("\\b([A-Z])\\w+");
        Matcher m1 = p1.matcher(readFile());

        Set<String> list = new HashSet<>();
        while (m1.find()) {
            list.add(m1.group());
        }
        return list;
    }

    //retrieve all words with a capital letter between "..."
    /*
    I need this method because method retrieveCapital() can retrieve data from String s = "Hi I like a Cat"; hi retrieve
    Hi, I, Cat but it's not classes. Method retrieveBacktick() works with data from "..."
     */
    static Set<String> retrieveBacktick() {
        Pattern p2 = Pattern.compile("([\"'])(?:(?=(\\\\?))\\2.)*?\\1");
        Matcher m2 = p2.matcher(readFile());

        StringBuilder sb = new StringBuilder();
        while (m2.find()) {
            sb.append(m2.group());
        }

        Set<String> set = new HashSet<>();
        Pattern p1 = Pattern.compile("\\b([A-Z])\\w+");
        Matcher m3 = p1.matcher(sb);
        while (m3.find()) {
            set.add(m3.group());
        }
        return set;
    }

    //retrieve ( class ... { )
    static String retrieveClasses() {
        Set<String> set = new HashSet<>();
        StringBuilder sb = new StringBuilder();

        Pattern p = Pattern.compile("class\\s+[a-zA-Z]\\w*\\s*\\{");
        Matcher m = p.matcher(readFile());

        while (m.find()) {
            sb.append(m.group());
        }

        String s = String.valueOf(sb);

        s = s.replaceAll("class", "");
        s = s.replaceAll("\\{", "");

        return s;
    }

    static StringBuilder readFile() {
        StringBuilder sBuild = new StringBuilder();

        FileReader fr = null;
        try {
            fr = new FileReader(path.getAbsolutePath());
            Scanner scan = new Scanner(fr);

            while (scan.hasNextLine()) {
                sBuild.append(scan.nextLine());
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                fr.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return sBuild;
    }


}

class Test {

}

class A {
    static class be {

    }
}




