package StandartClasses;

import java.util.Locale;

public class StringApp {
    public static void main(String[] args) {
        String name = "Saiful Amin Rizki";
        String nameLowerCase = name.toLowerCase();
        String nameUpperCase = name.toUpperCase();

        System.out.println(name);
        System.out.println(nameLowerCase);
        System.out.println(nameUpperCase);
        System.out.println(name.length());
        System.out.println(name.startsWith("Saiful"));
        System.out.println(name.endsWith("Rizki"));

        String[] names = name.split("");
        for (var value : names){
            System.out.println(value);
        }

        System.out.println(" ".isBlank());
        System.out.println(" ".isEmpty());
        System.out.println("".isEmpty());
        System.out.println(name.charAt(0));

    }
}
