package programmer.muda.il8n;

import org.junit.jupiter.api.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class DateFormatTest {
    @Test
    void testDateFormat() {
        var pattern = "EEEE dd MMMM yyyy";
        var dateFormat = new SimpleDateFormat(pattern);

        var format = dateFormat.format(new Date());
        System.out.println(format);
    }

    @Test
    void testDateFormatIndonesia() {
        var pattern = "EEEE dd MMMM yyyy";
        var indonesia = new Locale("id", "ID");
        var dateFormat = new SimpleDateFormat(pattern, indonesia);

        var format = dateFormat.format(new Date());
        System.out.println(format);
    }

    @Test
    void testDateFormatParseIndonesia() throws ParseException {
        var pattern = "EEEE dd MMMM yyyy";
        var indonesia = new Locale("id", "ID");
        var dateFormat = new SimpleDateFormat(pattern, indonesia);

        var date = dateFormat.parse("Rabu 27 November 2024");
    }
}
