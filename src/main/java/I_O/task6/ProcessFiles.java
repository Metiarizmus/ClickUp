package I_O.task6;

import java.io.File;
import java.io.IOException;
import java.util.GregorianCalendar;

public class ProcessFiles {

    public interface Strategy {
        void process(File file);
    }

    private Strategy strategy;
    private String ext;
    private GregorianCalendar calendar;

    public ProcessFiles(Strategy strategy, String ext, GregorianCalendar calendar) {
        this.strategy = strategy;
        this.ext = ext;
        this.calendar = calendar;
    }

    public void start(String[] args) {
        try {
            if (args.length == 0)
                processDirectoryTree(new File("."));
            else
                for (String arg : args) {

                    File fileArg = new File(arg);
                    if (fileArg.isDirectory())
                        processDirectoryTree(fileArg);
                    else {
// Allow user to leave off extension:
                        if (!arg.endsWith("." + ext))
                            arg += "." + ext;
                        strategy.process(
                                new File(arg).getCanonicalFile());
                    }
                }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


    public void processDirectoryTree(File root) throws IOException {

        if (root.lastModified() > calendar.getTimeInMillis()) {
            for (File file : Directory.walk(root.getAbsolutePath(), ".*\\." + ext))
                strategy.process(file.getCanonicalFile());
        }

    }
}