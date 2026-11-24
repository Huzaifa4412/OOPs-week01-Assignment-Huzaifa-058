package utilities;

import java.io.EOFException;
import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

/**
 * Reusable keyboard input using Java's Scanner.
 * Offers the same public methods as Read; prompts belong in the application.
 * Enter one value per line. Numeric methods consume the rest of their line,
 * so a subsequent getString() can read the next full line correctly.
 * Choose Scan OR Read in a program; both buffer System.in independently.
 */
public final class Scan {

    private static final Scanner IN =
            new Scanner(System.in).useLocale(Locale.US);

    private Scan() {
    }

    /** Reads a whole line and removes leading and trailing whitespace. */
    public static String getString() throws IOException {
        boolean available = IN.hasNextLine();
        checkForIoError();
        if (!available) {
            throw new EOFException("No more keyboard input.");
        }
        return IN.nextLine().trim();
    }

    public static int getInt() throws IOException {
        while (true) {
            if (IN.hasNextInt()) {
                int value = IN.nextInt();
                if (readRemainder().isEmpty()) {
                    return value;
                }
            } else {
                getString(); // Discard invalid input; report EOF if exhausted.
            }
            System.out.print("Enter a valid integer: ");
        }
    }

    public static long getLong() throws IOException {
        while (true) {
            if (IN.hasNextLong()) {
                long value = IN.nextLong();
                if (readRemainder().isEmpty()) {
                    return value;
                }
            } else {
                getString();
            }
            System.out.print("Enter a valid long integer: ");
        }
    }

    public static float getFloat() throws IOException {
        while (true) {
            if (IN.hasNextFloat()) {
                float value = IN.nextFloat();
                if (readRemainder().isEmpty()) {
                    return value;
                }
            } else {
                getString();
            }
            System.out.print("Enter a valid float: ");
        }
    }

    public static double getDouble() throws IOException {
        while (true) {
            if (IN.hasNextDouble()) {
                double value = IN.nextDouble();
                if (readRemainder().isEmpty()) {
                    return value;
                }
            } else {
                getString();
            }
            System.out.print("Enter a valid number: ");
        }
    }

    /** Scanner has no nextChar(); read the first character of a non-empty line. */
    public static char getChar() throws IOException {
        while (true) {
            String text = getString();
            if (!text.isEmpty()) {
                return text.charAt(0);
            }
            System.out.print("Enter at least one character: ");
        }
    }

    // Consume the line ending after nextInt(), nextDouble(), etc.
    // A non-empty remainder means the user entered extra data on that line.
    private static String readRemainder() throws IOException {
        boolean available = IN.hasNextLine();
        checkForIoError();
        return available ? IN.nextLine().trim() : "";
    }

    // Scanner stores underlying I/O failures; pass them to the calling program.
    private static void checkForIoError() throws IOException {
        IOException problem = IN.ioException();
        if (problem != null) {
            throw problem;
        }
    }

    // System.in belongs to the application, so this utility does not close it.
}
