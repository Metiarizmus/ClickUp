package holding_your_objects.task21;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

/*
Exercise 21: (3) Using a Map<String,Integer>, follow the form of UniqueWords.java to create a program that counts
 the occurrence of words in a file. Sort the results using Collections.sort( ) with a second argument of
 String.CASE_INSENSITIVE_ORDER (to produce an alphabetic sort), and display the result.
*/
public class Task21 {
    public static void main(String[] args) {

        List<String> ctext=new ArrayList<String>(Arrays.asList(fileReading("G:/csvInput.txt").split("\\W+")));

        Collections.sort(ctext,String.CASE_INSENSITIVE_ORDER);

        Map<String,Integer> map=new LinkedHashMap<String,Integer>();
        for(String c:ctext){
            Integer in=map.get(c);
            map.put(c,in==null?1:in+1);
        }

        System.out.println(map);

    }




    static String fileReading(String path) {

        if (path != null) {
            try (BufferedReader br = new BufferedReader(new FileReader(path))) {
                StringBuilder sb = new StringBuilder();
                String line = br.readLine();

                while (line != null) {
                    sb.append(line);
                    line = br.readLine();
                }

                return String.valueOf(sb);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return null;

    }
}
