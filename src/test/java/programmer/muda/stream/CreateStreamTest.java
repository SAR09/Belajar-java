package programmer.muda.stream;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Stream;

public class CreateStreamTest {

    @Test
    public void testCreateEmptyOrSingleStream(){

        Stream<String> emptyStream = Stream.empty();
        emptyStream.forEach(data -> {
            System.out.println(data);
        });

        Stream<String> oneStream = Stream.of("Saiful");
        oneStream.forEach(data -> {
            System.out.println(data);
        });

        Stream<String> emptyOrNotStream = Stream.ofNullable(null);
        emptyOrNotStream.forEach(item -> {
            System.out.println(item);
        });

    }

    @Test
    public void testCreateStreamForArray(){
        Stream<String> streamString = Stream.of("Saiful", "Amin", "Rizki");
        streamString.forEach(System.out::println);

        Stream<Integer> streamInteger = Stream.of(1,2,3,4,5,6,7);
        streamInteger.forEach(System.out::println);

        String[] array = new String[]{
                "Saiful", "Amin", "Rizki"
        };

        Stream<String> streamFromArray = Arrays.stream(array);
        streamFromArray.forEach(System.out::println);
    }

    @Test
    public void testCreateStreamFromCollection(){
        Collection<String> collection = List.of("Saiful", "Amin", "Rizki");
        Stream<String> stringStream = collection.stream();
        stringStream.forEach(System.out::println);
    }

    @Test
    public void testCreateInfiniteStream(){
        Stream<String> stream = Stream.generate(() -> "Programmer Muda");
//        stream.forEach(System.out::println);

        Stream<Integer> iterate = Stream.iterate(1, value -> value + 1);
//        iterate.forEach(System.out::println);
    }
}
