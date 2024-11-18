package Collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class CollectionApp {
    public static void main(String[] args) {
        Collection<String> collection = new ArrayList<>();
        collection.add("Saiful");
        collection.add("Amin");
        collection.addAll(List.of("Programmer", "Zaman", "Now"));


        System.out.println("===REMOVE===");
        collection.remove("Amin");
        collection.removeAll(List.of("Zaman", "Now"));


        for (var value : collection){
            System.out.println(value);
        }

        System.out.println("===MENGECEK DATA===");
        System.out.println(
                collection.contains("Saiful")
        );

        System.out.println(
                collection.containsAll(List.of("Programmer", "Zaman"))
        );

    }
}
