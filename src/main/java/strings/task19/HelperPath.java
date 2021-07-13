package strings.task19;

import java.io.File;

public class HelperPath {
    private static String absolutePath = "src\\main\\java\\strings\\task19\\Task19.java";

    public String getAbsolutePath() {
        File f = new File(absolutePath);
        String s = f.getAbsolutePath();

        return s;
    }
}
