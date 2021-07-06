package holding_your_objects.task16;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

/*
Exercise 16: (5) Create a Set of the vowels. Working from UniqueWords.
Java, count and display the number of vowels in each input word, and also display the total number of vowels in the input file.
*/
public class Task16 {

    private static Character[] mass = {'a', 'e', 'y', 'u', 'i', 'o', 'A', 'E', 'Y', 'U', 'I', 'O'};
    private static Set<Character> vowels = new HashSet(Arrays.asList(mass));

    public static void main(String[] args) {


        List<String> list = new ArrayList<>();
        list.add("welcom");
        list.add("cinema");
        list.add("AAOOYYE");

        System.out.println(countVowels(list));

        System.out.println(fileCountVowels("G:/csvInput.txt"));

    }

    static Map<String, Integer> countVowels(List<String> list) {
        if (list != null) {

            Map<String, Integer> map = new HashMap<>();
            int c = 0;

            for (String q : list) {
                for (char symbol : q.toCharArray()) {
                    if (vowels.contains(symbol)) {
                        c++;
                    }
                }
                map.put(q, c);
                c = 0;
            }
            return map;
        }
        return null;

    }

    static String fileReading(String path) {

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            StringBuilder sb = new StringBuilder();
            String line = br.readLine();

            while (line != null) {
                sb.append(line);
                sb.append(System.lineSeparator());
                line = br.readLine();
            }
            String everything = sb.toString();

            return everything;
        } catch (IOException e) {
            e.printStackTrace();
        }

        return null;

    }


    static int fileCountVowels(String p) {

        if (p != null) {

            int c = 0;

            for (char q : fileReading(p).toCharArray()) {
                if (vowels.contains(q)) {
                    c++;
                }
            }

            return c;
        }
        return 0;
    }
}
