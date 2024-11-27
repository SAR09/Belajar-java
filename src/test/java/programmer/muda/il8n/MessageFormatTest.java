package programmer.muda.il8n;

import org.junit.jupiter.api.Test;

import java.text.MessageFormat;
import java.util.Locale;
import java.util.ResourceBundle;

public class MessageFormatTest {
    @Test
    void testMessageFormat() {
        var pattern = "Hi {0}, Anda bisa mencari data anda dengan mengetikkan \"{}\" di pencarian";
        var messageFormat = new MessageFormat(pattern);
        var format = messageFormat.format(new Object[]{
                "Saiful"
        });

        System.out.println(format);


    }

    @Test
    void testMessageFormatResourceBundle() {
        var locale = new Locale("id", "ID");
        var resourceBundle = ResourceBundle.getBundle("message", locale);

        var pattern = resourceBundle.getString("welcome.message");

        var messageFormat = new MessageFormat(pattern);
        var format = messageFormat.format(new Object[]{
                "Saiful", "Programmer Muda"
        });

        System.out.println(format);
    }
}
