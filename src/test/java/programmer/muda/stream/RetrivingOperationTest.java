package programmer.muda.stream;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Optional;

public class RetrivingOperationTest {

    @Test
    void testLimit() {
        List.of("Saiful", "Amin", "Rizki").stream()
                .limit(2)
                .forEach(System.out::println);
    }

    @Test
    void testSkip() {
        List.of("Saiful", "Amin", "Rizki").stream()
                .skip(2)
                .forEach(System.out::println);
    }


    @Test
    void testTakeWhile() {
            List.of("Amin", "Rizki", "Tri").stream()
                    .takeWhile(name -> name.length() <= 4)
                    .forEach(System.out::println);

    }

    @Test
    void testDropWhile() {
        List.of("Amin", "Rizki", "Tri").stream()
                .dropWhile(name -> name.length() <= 4)
                .forEach(System.out::println);
    }

    @Test
    void testFindAny() {
        Optional<String> optional = List.of("Saiful", "Amin", "Rizki", "joko", "Budi", "Ahmad").stream()
                .findAny();

        optional.ifPresent(name -> {
            System.out.println(name);
        });
    }

    @Test
    void testFindFirst() {
        Optional<String> optional = List.of("Saiful", "Amin", "Rizki", "joko", "Budi", "Ahmad").stream()
                .findFirst();

        optional.ifPresent(name -> {
            System.out.println(name);
        });
    }

}

