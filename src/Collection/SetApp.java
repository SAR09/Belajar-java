package Collection;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetApp {
    public static void main(String[] args) {
        //Set<String> names = new HashSet<>();
        Set<String> names = new LinkedHashSet<>();
        names.add("Saiful");
        names.add("Amin");
        names.add("Rizki");
        names.add("Saiful");
        names.add("Amin");
        names.add("Rizki");

        for (var name : names){
            System.out.println(name);
        }
    }
}
