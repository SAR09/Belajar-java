package Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsApp {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.addAll(List.of("Saiful", "Amin", "Rizki", "Budi", "Agus"));

        System.out.println("List Normal : " + list);

        Collections.reverse(list);
        System.out.println("List setelah di reverse : " + list);

        Collections.shuffle(list);
        System.out.println("List setelah di shuffle : " + list);
    }
}
