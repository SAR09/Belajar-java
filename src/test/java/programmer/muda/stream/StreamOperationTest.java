package programmer.muda.stream;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.stream.Stream;

public class StreamOperationTest {

    @Test
    public void testStreamOperation(){
        List<String> names = List.of("Saiful", "Amin", "Rizki");

        Stream<String> streamNames = names.stream();
        Stream<String> streamUpper = streamNames.map(String::toUpperCase);

        streamUpper.forEach(System.out::println);
        names.forEach(System.out::println);
    }
}
