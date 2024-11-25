package programmer.muda.stream;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.stream.Stream;

public class TransformationOperationTest {

    @Test
    void testMapOperation() {
        List.of("Saiful", "Amin", "Rizki").stream()
                .map(name -> name.toUpperCase())
                .map(upperName ->upperName.length())
                .forEach(length -> System.out.println(length));
    }

    @Test
    void testFlatMap() {
        List.of("Saiful", "Amin", "Rizki").stream()
                .map(name -> name.toUpperCase())
                .flatMap(upper -> Stream.of(upper,upper.length()))
                .flatMap(value -> Stream.of(value, value, value))
                .forEach(length -> System.out.println(length));
    }
}
