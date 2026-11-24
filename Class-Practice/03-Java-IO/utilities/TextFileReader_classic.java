//package utilities;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

/**
 * Reusable utility for reading text files.
 *
 * Classic pipeline:
 * File -> FileReader -> BufferedReader -> String lines
 *
 * FileReader opens and decodes the text file.
 * BufferedReader wraps it for efficient line-based reading.
 */
public final class TextFileReader_classic {

    // Utility class: no objects are required.
    private TextFileReader_classic() {
    }

    /** Convenience overload: accepts a file name. */
    public static String[] readLines(String fileName)
            throws IOException {

        return readLines(Path.of(fileName));
    }

    /** Core overload: accepts a Path and shows classic reader chaining. */
    public static String[] readLines(Path path)
            throws IOException {

        List<String> lines = new ArrayList<>();

        /*
         * Cascaded objects:
         * FileReader -> reads/decodes characters from the file
         * BufferedReader -> adds buffering and readLine()
         */
        try (BufferedReader file = new BufferedReader(
                new FileReader(
                        path.toFile(),
                        StandardCharsets.UTF_8))) {

            String line;

            // Read sequentially until end-of-file.
            while ((line = file.readLine()) != null) {
                lines.add(line);
            }
        }

        // Return a simple array to the calling application.
        return lines.toArray(new String[0]);
    }
}
