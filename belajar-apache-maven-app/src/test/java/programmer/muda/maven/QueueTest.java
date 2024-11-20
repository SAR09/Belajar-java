package programmer.muda.maven;

import org.junit.jupiter.api.*;

import java.util.LinkedList;
import java.util.Queue;

@DisplayName("A queue")
public class QueueTest {

    private Queue<String> queue;

    @Nested
    @DisplayName("When new")
    public class WhenNew{

        @BeforeEach
        void setUp(){
            queue = new LinkedList<>();
        }

        @Test
        @DisplayName("When offer, size must be 1")
        void offerNewData(){
            queue.offer("Saiful");
            Assertions.assertEquals(1, queue.size() );
        }


        @Test
        @DisplayName("When offer, size must be 2")
        void offerMoreData(){
            queue.offer("Saiful");
            queue.offer("Amin");
            Assertions.assertEquals(2, queue.size() );
        }
    }
}
