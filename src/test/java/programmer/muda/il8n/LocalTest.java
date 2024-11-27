package programmer.muda.il8n;

import org.junit.jupiter.api.Test;

import java.util.Locale;

public class LocalTest {

    @Test
    void testNewLocal() {
        var language = "id";
        var country = "ID";
        var locale = new Locale(language, country);

        System.out.println(locale.getLanguage());
        System.out.println(locale.getCountry());

        System.out.println(locale.getDisplayLanguage());
        System.out.println(locale.getDisplayCountry());
    }
}
