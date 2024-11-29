package programmer.muda.thread;

import org.junit.jupiter.api.Test;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.TimeUnit;

public class ThreadLocalRandomTest {

    @Test
    void test() throws InterruptedException {

        final var executor = Executors.newFixedThreadPool(100);

        for (int i = 0; i < 100; i++) {
            executor.execute(()->{
                try {
                    Thread.sleep(100);
                    var number = ThreadLocalRandom.current().nextInt();
                    System.out.println(number);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            });
        }

        executor.awaitTermination(1, TimeUnit.DAYS);
    }

    @Test
    void stream() throws InterruptedException {
        final var exexutor = Executors.newFixedThreadPool(10);

        exexutor.execute(()->{
            ThreadLocalRandom.current().ints(100, 0, 1000)
                    .forEach(System.out::println);
        });

        exexutor.shutdown();
        exexutor.awaitTermination(1, TimeUnit.DAYS);
    }
}
