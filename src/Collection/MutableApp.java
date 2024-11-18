package Collection;

import Collection.Data.Person;

import java.util.List;

public class MutableApp {
    public static void main(String[] args) {
        Person person = new Person("Saiful");

        person.addHobby("Coding");
        person.addHobby("Gaming");

        doSomethingWithHobbies(person.getHobbies());

        for (var hobby : person.getHobbies()){
            System.out.println(hobby);
        }

    }

    public static void doSomethingWithHobbies(List<String> hobbies){
        hobbies.add("Bukan Hobby");
    }
}
