
import utilities.TextFileReader_classic;

public class MainClassicFileReader {

    public static void main(String[] args)
            throws Exception {

        String[] lines = TextFileReader_classic.readLines(
                "data/movies.txt");

        for (String line : lines) {
            System.out.println(line);
        }
    }

}
