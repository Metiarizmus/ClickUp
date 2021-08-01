package I_O.task26;

import I_O.task1.TextFile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

//Exercise 26: (3) Modify strings/JGrep.java to use Java nio memorymapped files.
public class Task26 {
    public static void main(String[] args) throws IOException {

        if(args.length < 2) {
            System.out.println("Usage: java JGrep file regex");
            System.exit(1);
        }
        Pattern p = Pattern.compile(args[1]);
        int index = 0;
        Matcher m = p.matcher("");
        Path path = Paths.get(args[0]);
        for (String line : Files.readAllLines(path)) {
            m.reset(line);
            while (m.find())
                System.out.println(index++ + ": " +
                        m.group() + ": " + m.start());
        }

    }
}
