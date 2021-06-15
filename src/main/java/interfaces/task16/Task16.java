package interfaces.task16;

import java.io.IOException;
import java.nio.CharBuffer;
import java.util.Random;
import java.util.Scanner;

/*
Exercise 16: (3) Create a class that produces a sequence of chars. Adapt this class so that it can be an input to a Scanner object.
*/
public class Task16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(new AdapterRandomChar(7));
        while (scanner.hasNext()) {
            System.out.println(scanner.nextLine() + " ");
        }
    }
}

class RandomChar {
    private static Random random = new Random();

    public char next() {
        return (char) (random.nextInt(26) + 97);
    }
}

class AdapterRandomChar extends RandomChar implements Readable {

    private int count;

    public AdapterRandomChar(int count) {
        this.count = count;
    }

    public int read(CharBuffer cb) {
        if(count-- == 0) return -1;

        String result = Character.toString(next()) + " ";
        cb.append(result);
        return result.length();
    }

}