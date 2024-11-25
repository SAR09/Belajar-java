package programmer.muda.stream;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.stream.Stream;

public class StreamPipelineTest {

    @Test
    void testCreateSreamPipeline() {

        //JARANG DIGUNAKANAN
//        List<String> list = List.of("Saiful", "Amin", "Rizki");
//
//        Stream<String> stream = list.stream();
//
//        Stream<String> stringUpper = stream.map(name -> name.toUpperCase());
//
//        Stream<String> streamMr = stringUpper.map(upper -> "Mr. " + upper);
//
//        streamMr.forEach(System.out::println);

    }

    @Test
    void testCreateStreamPipeLineOk() {
        List<String> list = List.of("Saiful", "Amin", "Rizki");

        list.stream()
                .map(name->name.toUpperCase())
                .map(upper -> "Mr." + upper)
                .forEach(System.out::println);
    }
}
