package ObjectOrientedProgramming.Package.Application;

public class EqualsApp {
    public static void main(String[] args) {
        String first = "Saiful";
        first = first + " " + "Amin";

        System.out.println(first);

        String second = "Saiful Amin";
        System.out.println(second);

        System.out.println(first == second);
        System.out.println(first.equals(second));

        String third = "Saiful Amin";
        System.out.println(second == third);
        System.out.println(second.equals(third));
    }
}
