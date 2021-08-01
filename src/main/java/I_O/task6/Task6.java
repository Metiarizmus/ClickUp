package I_O.task6;

import java.io.File;
import java.util.Calendar;
import java.util.GregorianCalendar;

/*
Exercise 6: (5) Use ProcessFiles to find all the Java source-code files in a particular directory
subtree that have been modified after a particular date.
 */
public class Task6 {
    public static void main(String[] args) {

        GregorianCalendar calendar = new GregorianCalendar(2021,Calendar.JULY,22);
        new ProcessFiles(new ProcessFiles.Strategy() {
            public void process(File file) {
                System.out.println(file);
            }
        }, "java", calendar).start(args);



    }
}
