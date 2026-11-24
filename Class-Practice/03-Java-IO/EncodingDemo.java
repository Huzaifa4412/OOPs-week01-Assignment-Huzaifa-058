import java.nio.charset.StandardCharsets;
import java.util.Arrays;

public class EncodingDemo {

    public static void main(String[] args) {

        int number = 123;

        // int -> text
        String text = String.valueOf(number);
        // text -> bytes: ENCODING
        byte[] bytes = text.getBytes(StandardCharsets.UTF_8);
        System.out.println(
                "Bytes   : " + Arrays.toString(bytes));

        
        // bytes -> text: DECODING
        String decoded = new String( bytes, StandardCharsets.UTF_8);
        System.out.println( "Decoded : " + decoded);

        // text -> int: PARSING
        int restored = Integer.parseInt(decoded);
        System.out.println("Integer : " + restored);
    }
}
