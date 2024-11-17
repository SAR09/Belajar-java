package StandartClasses;

import java.nio.charset.StandardCharsets;
import java.util.Base64;

public class Base64App {
    public static void main(String[] args) {
        String original = "Saiful Amin Rizki";

        String encoded = Base64.getEncoder().encodeToString(original.getBytes());
        System.out.println(encoded);

        byte[] decoder = Base64.getDecoder().decode(encoded);
        String result = new String(decoder);
        System.out.println(result);
    }
}
