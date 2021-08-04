package I_O.task14;

import java.io.*;

/*
Exercise 14: (2) Starting with BasicFileOutput.java, write a program that compares the performance of writing to
a file when using buffered and unbuffered I/O.
*/
public class Task14 {
    private static String writeFile = "G:/csvOutput.txt";
    private static String readFile = "G:/csvInput.txt";

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
        BufferedReader in = new BufferedReader(new StringReader(BufferedInputFile.read(readFile)));
        PrintWriter out = new PrintWriter(writeFile);

        int lineCount = 1;
        String s;

        while ((s = in.readLine()) != null) {
            out.println(lineCount++ + ": " + s);
        }

        out.close();
        in.close();
    }

    static void usingUnbuf() throws IOException {
        FileOutputStream fos = new FileOutputStream(writeFile);
        FileInputStream fis = new FileInputStream(readFile);

        while (fis.read() != -1) {
            fos.write(fis.read());
        }

        fis.close();
        fos.close();
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