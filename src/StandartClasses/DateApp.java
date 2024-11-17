package StandartClasses;

import java.util.Calendar;
import java.util.Date;

public class DateApp {
    public static void main(String[] args) {
        Date tanggal = new Date();
        System.out.println(tanggal);

        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.YEAR, 2004);
        calendar.set(Calendar.MONTH, 10);
        calendar.set(Calendar.DATE, 19);

        Date result = calendar.getTime();
        System.out.println(result);
    }
}
