package Collection;

import java.util.Collections;
import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeSet;

public class NavigableSetApp {
    public static void main(String[] args) {

        NavigableSet<String> names = new TreeSet<>();
        names.addAll(Set.of("Saiful", "Amin", "Rizki", "Budi", "Agus", "Bambang"));

        NavigableSet<String> namesRevers = names.descendingSet();
        NavigableSet<String> rizki = names.tailSet("Rizki", true);

        for (var name : rizki){
            System.out.println(name);
        }

        NavigableSet<String> immutable = Collections.unmodifiableNavigableSet(names);
//        immutable.add("ssad"); //ERROR
    }
}
