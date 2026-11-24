import java.io.ByteArrayInputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

public class DecodingDemo {// void main()

    public static void main(String[] args) throws Exception {

        String original = "Humera";
        // 1. Encode characters into UTF-8 bytes.
        byte[] bytes = original.getBytes(StandardCharsets.UTF_8);
        System.out.println(
                "Bytes      : " + Arrays.toString(bytes));

        // 2. Supply the bytes as an input stream.
        ByteArrayInputStream source = new ByteArrayInputStream(bytes);

        // 3. Decode UTF-8 bytes back into characters.
        InputStreamReader decoder = new InputStreamReader(source, StandardCharsets.UTF_8);
        System.out.print("Characters : ");

        int character;

        while ((character = decoder.read()) != -1) {
            System.out.print((char) character);
        }
    }
}