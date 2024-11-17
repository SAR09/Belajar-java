package StandartClasses;

public class StringBuilderApp {
    public static void main(String[] args) {
        StringBuilder name = new StringBuilder();
        name.append("Saiful");
        name.append(" ");
        name.append("Amin");
        name.append(" ");
        name.append("Rizki");

        String fullName = name.toString();
        System.out.println(fullName);

    }

}
