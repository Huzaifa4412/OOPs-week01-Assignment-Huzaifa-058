import java.io.IOException;
import utilities.TextFileReader;

public class MainTextFileReader {
    public static void main(String[] args) throws IOException {
        // The utility reads text; this application knows the profile format.
        String[] lines = TextFileReader.readLines("sample.txt");
        if (lines.length != 4 || lines[3].trim().isEmpty()) {
            throw new IllegalArgumentException(
                    "Expected four lines: name, movies watched, rating, genre.");
        }

        String name = lines[0].trim();
        int watched = Integer.parseInt(lines[1].trim());
        double rating = Double.parseDouble(lines[2].trim());
        char genre = Character.toUpperCase(lines[3].trim().charAt(0));

        System.out.println("=== Movie Night Quick Profile ===");
        System.out.println("\n--- Profile ---");
        System.out.println("Viewer : " + name);
        System.out.println("Watched: " + watched);
        System.out.println("Rating : " + rating);
        System.out.println("Genre  : " + genre);
    }
}
