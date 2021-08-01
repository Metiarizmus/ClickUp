package I_O.task1;

import java.io.File;

public interface FilenameFilter {
    boolean accept(File dir, String name);
}
