package StandartClasses;

public class NumberClassApp {
    public static void main(String[] args) {
        Integer intValue = 10;

        Long longValue = intValue.longValue();
        Double doubleValue = intValue.doubleValue();
        Short shortValue = intValue.shortValue();

        System.out.println(longValue);
        System.out.println(doubleValue);
        System.out.println(shortValue);


        String contoh = "1000";

        Integer contohInt = Integer.valueOf(contoh);
        System.out.println(contohInt);
        System.out.println(contohInt);



    }
}
