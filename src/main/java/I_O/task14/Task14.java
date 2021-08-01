package I_O.task14;

import java.io.*;

/*
Exercise 14: (2) Starting with BasicFileOutput.java, write a program that compares the performance of writing to a file when using buffered and unbuffered I/O.
*/
public class Task14 {
    static String file = "G:/csvOutput.txt";

    public static void main(String[] args) throws IOException {
        long startUnbuf = System.currentTimeMillis();
        usingUnbuf();
        long finishUnbuf = System.currentTimeMillis();

        long startBuf = System.currentTimeMillis();
        usingBuf();
        long finishBuf = System.currentTimeMillis();

        System.out.println("time with using buf = " + (finishBuf-startBuf));
        System.out.println("time with using unBuf = " + (finishUnbuf-startUnbuf));
    }

    static void usingBuf() throws IOException {
        BufferedReader in = new BufferedReader(new StringReader(BufferedInputFile.read("G:/csvInput.txt")));

        PrintWriter out = new PrintWriter(file);

        int lineCount = 1;
        String s;

        while ((s = in.readLine()) != null) {
            out.println(lineCount++ + ": " + s);
        }

        out.close();

    }

    static void usingUnbuf() throws IOException {
        BufferedReader in = new BufferedReader( new StringReader(BufferedInputFile.read("G:/csvInput.txt")));
        PrintWriter out = new PrintWriter(new FileWriter(file));
        int lineCount = 1;
        String s;
        while((s = in.readLine()) != null ){
            out.println(lineCount++ + ": " + s);
        }

        out.close();

    }
}

class BufferedInputFile {
    public static String read(String filename) throws IOException {
        BufferedReader in = new BufferedReader(new FileReader(filename));
        String s;
        StringBuilder sb = new StringBuilder();

        while ((s = in.readLine()) != null)
            sb.append(s + "\n");

        in.close();

        return sb.toString();
    }
}