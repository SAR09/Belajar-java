package Lambda.App;

import java.util.List;
import java.util.function.Consumer;

public class ForEachpp {
    public static void main(String[] args) {

        List<String> list = List.of("Saiful", "Amin", "Rizki");

        // FOR LOOP
        for (var value : list){
            System.out.println(value);
        }

        // FOR LOOP DENGAN ANONYMOUS CLASS
        list.forEach(new Consumer<String>() {
            @Override
            public void accept(String value) {
                System.out.println(value);
            }
        });

        // FOR LOOP LAMBDA
        list.forEach(value -> System.out.println(value));

        // Lamda method reference
        list.forEach(System.out::println);
    }
}
