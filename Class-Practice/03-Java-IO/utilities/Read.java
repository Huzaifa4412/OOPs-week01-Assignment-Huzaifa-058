package utilities;
import java.io.BufferedReader;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStreamReader;
/**
 * Reusable keyboard input using BufferedReader.
 * Reads one value per line and retries invalid numeric input.
 * Application prompts and business rules belong in the calling program.
 * Choose Read OR Scan in a program; both buffer System.in independently.
 */
public final class Read {
    // System.in provides abstraction for Keyboard e.g this way you connect
    // streamReader to keyboard
    private static final BufferedReader IN = new BufferedReader(new InputStreamReader(System.in));

    private Read() {
    }

    /** Reads a whole line and removes leading and trailing whitespace. */
    public static String getString() throws IOException {
        String text = IN.readLine();
        if (text == null) {
            throw new EOFException("No more keyboard input.");
        }
        return text.trim();
    }

    public static int getInt() throws IOException {
        while (true) {
            try {
                return Integer.parseInt(getString());
            } catch (NumberFormatException e) {
                System.out.print("Enter a valid integer: ");
            }
        }
    }

    public static long getLong() throws IOException {
        while (true) {
            try {
                return Long.parseLong(getString());
            } catch (NumberFormatException e) {
                System.out.print("Enter a valid long integer: ");
            }
        }
    }

    public static float getFloat() throws IOException {
        while (true) {
            try {
                return Float.parseFloat(getString());
            } catch (NumberFormatException e) {
                System.out.print("Enter a valid float: ");
            }
        }
    }

    public static double getDouble() throws IOException {
        while (true) {
            try {
                return Double.parseDouble(getString());
            } catch (NumberFormatException e) {
                System.out.print("Enter a valid number: ");
            }
        }
    }

    /** Reads the first character of a non-empty, trimmed line. */
    public static char getChar() throws IOException {
        while (true) {
            String text = getString();
            if (!text.isEmpty()) {
                return text.charAt(0);
            }
            System.out.print("Enter at least one character: ");
        }
    }

    // System.in belongs to the application, so this utility does not close it.
}
