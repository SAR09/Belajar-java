package programmer.muda.stream;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.stream.Stream;

public class LazyEvaluationTest {

    @Test
    void testIntermediateOperation() {

        List<String> names = List.of("Saiful", "Amin", "Rizki");

        Stream<String> upper = names.stream()
                .map(name -> {
                    System.out.println("Change " + name + "to UPPERCASE");
                    return name.toUpperCase();
                });

    }

    @Test
    void testTerminalOperation() {

        List<String> names = List.of("Saiful", "Amin", "Rizki");

        names.stream()
                .map(name -> {
                    System.out.println("Change " + name + " to UPPERCASE");
                    return name.toUpperCase();
                })
                .forEach(upper -> {
                    System.out.println(upper);
                });
    }
}
