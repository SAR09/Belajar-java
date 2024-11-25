package programmer.muda.stream;

import org.junit.jupiter.api.Test;

import java.util.Objects;
import java.util.stream.Stream;

public class CreateStreamBuilderTest {

    @Test
    public void testCreateStreamBuilder(){

        Stream.Builder<String> builder = Stream.builder();
        builder .accept("Saiful");
        builder.add("Amin").add("Rizki");

        Stream<String> stream = builder.build();
        stream.forEach(System.out::println);
    }

    @Test
    public void testCreateStreamBuilderSimplfy(){
        Stream<Object> stream =  Stream.builder()
                .add("Saiful").add("Amin").add("Rizki").build();

        stream.forEach(System.out::println);

    }

}
