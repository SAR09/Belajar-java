package Generic.Application;

import Generic.Person;

import java.util.Arrays;

public class ComparableApp {
    public static void main(String[] args) {

        Person[] people = {
                new Person("Saiful", "Indonesia"),
                new Person("Agus", "Indonesia"),
                new Person("Budi", "Indonesia")
        };

        Arrays.sort(people);

        System.out.println(Arrays.toString(people));
    }
}
