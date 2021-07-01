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

    private static char[] mass = {'a', 'e', 'y', 'u', 'i', 'o', 'A', 'E', 'Y', 'U', 'I', 'O'};

    public static void main(String[] args) {


        List<String> list = new ArrayList<>();
        list.add("welcom");
        list.add("cinema");
        list.add("AAOOYYE");

        System.out.println(countVowels(list));

        System.out.println(fileCountVowels());

    }

    static Map<String, Integer> countVowels(List<String> list) {

        if (list != null) {
            Integer count = 0;
            Map<String, Integer> map = new HashMap<>();

            for (int i = 0; i < list.size(); i++) {
                char[] chars = list.get(i).toCharArray();

                for (int j = 0; j < chars.length; j++) {

                    for (Character q : mass) {

                        if (q == (chars[j])) {
                            count++;
                        }

                    }
                }
                map.put(list.get(i), count);
                count = 0;
            }

            return map;
        }

        return null;
    }

    static String fileReading(String path) {

        if (path != null) {
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
        }
        return null;

    }


    static int fileCountVowels() {
        char[] chars = fileReading("G:/csvInput.txt").toCharArray();

        int c = 0;
        for (int i = 0; i < chars.length; i++) {

            for (int j = 0; j < mass.length; j++) {

                if (chars[i] == mass[j]) {
                    c++;
                }
            }
        }

        return c;
    }
}
