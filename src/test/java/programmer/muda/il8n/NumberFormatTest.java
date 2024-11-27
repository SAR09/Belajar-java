package programmer.muda.il8n;

import org.junit.jupiter.api.Test;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class NumberFormatTest {
    @Test
    void testNumberFormat() {
        var numberFormat = NumberFormat.getNumberInstance();
        var format = numberFormat.format(100000.25);
        System.out.println(format);
    }

    @Test
    void testNumberFormatIndonesia() {
        var indonesia = new Locale("id", "ID");
        var numberFormat = NumberFormat.getNumberInstance(indonesia);
        var format = numberFormat.format(100000.25);
        System.out.println(format);
    }

    @Test
    void testNumberFormatParseIndonesia() throws ParseException {
        var indonesia = new Locale("id", "ID");
        var numberFormat = NumberFormat.getNumberInstance(indonesia);
        var number = numberFormat.parse("10.000.000,25").doubleValue();
        System.out.println(number);

    }
}
