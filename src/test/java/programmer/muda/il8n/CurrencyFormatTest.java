package programmer.muda.il8n;

import org.junit.jupiter.api.Test;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Currency;
import java.util.Locale;

public class CurrencyFormatTest {

    @Test
    void testCurencyIndonesia() {
        var indonesia = new Locale("id", "ID");
        var curency = Currency.getInstance(indonesia);

        System.out.println(curency.getDisplayName());
        System.out.println(curency.getCurrencyCode());
        System.out.println(curency.getSymbol(indonesia));
    }

    @Test
    void testNumberFormatCurencyIndonesia() {
        var indonesia = new Locale("id", "ID");
        var numberFormat = NumberFormat.getCurrencyInstance(indonesia);

        var format = numberFormat.format(10000000);
        System.out.println(format);
    }

    @Test
    void testNumberFormatCurencyParseIndonesia() throws ParseException {
        var indonesia = new Locale("id", "ID");
        var numberFormat = NumberFormat.getCurrencyInstance(indonesia);

        var parse = numberFormat.parse("Rp10.000.000");
        System.out.println(parse);
    }
}
