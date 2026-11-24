import java.io.IOException;
//import utilities.Read;

public class MainRead {
    public static void main(String[] args) throws IOException {
        System.out.println("=== Movie Night Quick Profile ===");

        System.out.print("Your name: ");
        String name = Read.getString();

        System.out.print("Movies watched this month: ");
        int watched = Read.getInt();

        System.out.print("Average movie rating (0-10): ");
        double rating = Read.getDouble();

        System.out.print("Preferred genre [A=Action, C=Comedy, S=Story]: ");
        char genre = Character.toUpperCase(Read.getChar());

        System.out.println("\n--- Profile ---");
        System.out.println("Viewer : " + name);
        System.out.println("Watched: " + watched);
        System.out.println("Rating : " + rating);
        System.out.println("Genre  : " + genre);
    }
}
