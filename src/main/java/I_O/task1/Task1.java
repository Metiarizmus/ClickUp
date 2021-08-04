package I_O.task1;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.regex.Pattern;

/*
Exercise 1: (3) Modify DirList.java (or one of its variants) so that the FilenameFilter opens and reads each file
(using the net.mindview.util.TextFile utility) and accepts the file based on whether any of the trailing arguments on
the command line exist in that file.
 */
public class Task1 {

    static void filesFind(File file, String[] args, List<String> list) {


        File[] files = file.listFiles();

        if (args.length == 0) {
            for (File q : files) {
                list.add(q.getName());

            }
        }else {
            DirFilter dirFilter = new DirFilter(args[0]);

            for (File q : files) {
                if (dirFilter.accept(q.getName())){
                    list.add(q.getName());
                }

            }
        }

    }

    public static void main(String[] args) {

        File path = new File(".");

        List<String> list = new ArrayList<>();
        filesFind(path, args, list);


        Collections.sort(list, String.CASE_INSENSITIVE_ORDER);
        for(String dirItem : list)
            System.out.println(dirItem);


    }
}

class DirFilter implements FilenameFilter {
    private Pattern pattern;
    public DirFilter(String regex) {
        pattern = Pattern.compile(regex);
    }
    public boolean accept( String name) {
        return pattern.matcher(name).matches();
    }
}
