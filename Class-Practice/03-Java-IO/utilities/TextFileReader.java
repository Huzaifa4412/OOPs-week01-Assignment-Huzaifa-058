package utilities;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

/**
 * Reusable utility for reading text files.
 *
 * Application code asks for text/lines;
 * this class hides file-opening and buffering details.
 */
public final class TextFileReader {

    // Utility class: objects are not required.
    private TextFileReader() {
    }

    /** Convenience overload: accepts a file name. */
    public static String[] readLines(String fileName)
            throws IOException {

        return readLines(Path.of(fileName));
    }

    /** Core overload: accepts a Path. */
    public static String[] readLines(Path path)
            throws IOException {

        List<String> lines = new ArrayList<>();

        // File -> decoder/reader -> BufferedReader -> lines
        try (BufferedReader file = Files.newBufferedReader(
                path,
                StandardCharsets.UTF_8)) {

            String line;

            // Read sequentially until end-of-file.
            while ((line = file.readLine()) != null) {
                lines.add(line);
            }
        }
        return lines.toArray(new String[0]);
    }

    /** Reads the complete file as one String. */
    public static String readText(String fileName)
            throws IOException {

        return Files.readString(
                Path.of(fileName),
                StandardCharsets.UTF_8);
    }
}
