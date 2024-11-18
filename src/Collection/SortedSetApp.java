package Collection;

import Collection.Data.Person;
import Collection.Data.PersonComparator;

import java.util.Collections;
import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetApp {
    public static void main(String[] args) {

        SortedSet<Person> people = new TreeSet<>(new PersonComparator().reversed());

        people.add(new Person("Saiful"));
        people.add(new Person("Budi"));
        people.add(new Person("Joko"));

        for (var person : people){
            System.out.println(person.getName());
        }

        SortedSet<Person> sortedSet = Collections.unmodifiableSortedSet(people);
//        sortedSet.add(new Person("Kurniawan"));

    }
}
