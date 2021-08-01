package I_O.task10;

/*
Exercise 10: (2) Modify Exercise 8 to take additional command-line arguments of words to find in the file.
Print all lines in which any of the words match.

Exercise 8: (1) Modify Exercise 7 so that the name of the file you read is provided as a command-line argument.

Exercise 7: (2) Open a text file so that you can read the file one line at a time.
Read each line as a String and place that String object into a LinkedList.
Print all of the lines in the LinkedList in reverse order.
*/

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class Task10 {
    public static void main(String[] args) throws IOException {

        if (args.length == 0) {
            System.out.println("need more parameters in args");
            System.exit(0);
        }

            List<String> list = read(args[0]);

            /*ListIterator<String> it = list.listIterator(list.size());

            while (it.hasPrevious()) {
                System.out.println(it.previous());
            }*/

            System.out.println(searchWord(args));



    }

    static List<String> read(String args) throws IOException {
        File file = new File(args);
        List<String> list = new LinkedList<>();
        BufferedReader reader = new BufferedReader(new FileReader(file));
        String s;

        while ((s = reader.readLine()) != null) {
            list.add(s);
        }
        reader.close();

        return list;
    }

    static List<String> searchWord(String[] args) throws IOException {
        List<String> listFull = read(args[0]);
        List<String> sent = new ArrayList<>();

        for (int i = 0; i < listFull.size(); i++) {
            for (int j = 1; j < args.length; j++) {
                if (Arrays.asList(listFull.get(i).split("\\s")).contains(args[j])) {
                    sent.add(listFull.get(i));
                }
            }

        }

        return sent;
    }
}